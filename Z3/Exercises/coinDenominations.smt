; A country mints 3 denominations of coins, in whole numbers of
;centos. It requires 3 of these coins to make 20 centos, or 23
;centos, or 29 centos. What are the denominations of coins? 

(declare-fun coin (Int) Int)


(define-fun coinCombinations ((outcome Int))Bool
    (exists ((x Int)(y Int)(z Int))
        (and
            (>= x 1) 
            (<= x 3)

            (>= y 1) 
            (<= y 3)

            (>= z 1) 
            (<= z 3)

            (= outcome (+ (coin x)(coin y)(coin z)))
        )
        
    )
)

(assert (coinCombinations 20))
(assert (coinCombinations 23))
(assert (coinCombinations 29))


(assert 
    (and
        (<= 0 (coin 1))
        (<= 0 (coin 2))
        (<= 0 (coin 3))
    )
)



(check-sat)
(get-value((coin 1)(coin 2)(coin 3)))