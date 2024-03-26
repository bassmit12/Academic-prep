; You have a balance scale with four weights. With these four
; weights you must balance any whole number load from 1kg all
; the way up to 40kg. How much should each of the four weights
; weigh? 

; Change values from ints to booleans to make it faster

(declare-fun weight (Int) Int)

(define-fun balance ((lowerRange Int) (upperRange Int)) Bool
    (forall ((load Int))
        (implies
            (and 
                ; load is every value between lower and upper range
                (>= load lowerRange)
                (<= load upperRange)
            )
            ; a b c d are the amount of times a weight is used
            (exists ((a Int) (b Int) (c Int) (d Int))
                (and      
                    ; negative weights are on the other side
                    (>= a -1)
                    (>= b -1)
                    (>= c -1)
                    (>= d -1)
                    
                    ; weight can only be used 0 or 1 time
                    (<= a 1)
                    (<= b 1)
                    (<= c 1)
                    (<= d 1)
                    

                    (= load (+ 
                                (* a (weight 1))
                                (* b (weight 2))
                                (* c (weight 3))
                                (* d (weight 4))
                            )
                    )
                )
            )
            
        )
        
    )
)
        
(assert (balance 1 40))
(assert 
    (and
        ; no negative weights
        (> (weight 1) 0)
        (> (weight 2) 0)
        (> (weight 3) 0)
        (> (weight 4) 0)

        (> (weight 1) (weight 2))
        (> (weight 2) (weight 3))
        (> (weight 3) (weight 4))
    )

)

(check-sat)
; 1 3 9 27 should be an answer
(get-value ((weight 1) (weight 2) (weight 3) (weight 4)))

