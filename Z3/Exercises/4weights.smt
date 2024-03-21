; You have a balance scale with four weights. With these four
; weights you must balance any whole number load from 1kg all
; the way up to 40kg. How much should each of the four weights
; weigh? 


(declare-fun weight (Int) Int)

(define-fun balance ((lowerRange Int) (upperRange Int)) Bool
    (forall ((load Int))
        ; a b c d are the amount of times a weight is used
        (exists ((a Int) (b Int) (c Int) (d Int))
            (and
                ; no negative weights
                (> (weight 1) 0)
                (> (weight 2) 0)
                (> (weight 3) 0)
                (> (weight 4) 0)
                
                ; no negative amount of weights
                (>= a 0)
                (>= b 0)
                (>= c 0)
                (>= d 0)

                ; load is every value between lower and upper range
                (>= load lowerRange)
                (<= load upperRange)

                ; can only use 4 weights in total
                (>= 4 (+ a b c d))
                
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
        
(assert (balance 1 40))

(check-sat)
(get-value ((weight 1) (weight 2) (weight 3) (weight 4)))

