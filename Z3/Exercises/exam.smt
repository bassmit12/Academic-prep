(declare-const N Int)
(declare-const X Int)

(assert (<= 1 N 25))

(assert
    (forall ((N Int))
        (=> 
            (<= 26 N 50)
            (= N X)
        )
    )
)

(check-sat)
(get-value (X))

