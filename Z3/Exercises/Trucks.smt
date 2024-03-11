; accepts a truck and returns the amount
(declare-fun nuzzles (Int) Int)
(declare-fun prittles (Int) Int)
(declare-fun skipples (Int) Int)
(declare-fun crottles (Int) Int)
(declare-fun dupples (Int) Int)


(assert (and
    ; there are a given amount of nuzzles etc...
    (= 4
        (+
            (nuzzles 1)
            (nuzzles 2)
            (nuzzles 3)
            (nuzzles 4)
            (nuzzles 5)
            (nuzzles 6)
        )
    )
    (>= 1
        (+
            (prittles 1)
            (prittles 2)
            (prittles 3)
            (prittles 4)
            (prittles 5)
            (prittles 6)
        )

    )
    (= 8
        (+
            (skipples 1)
            (skipples 2)
            (skipples 3)
            (skipples 4)
            (skipples 5)
            (skipples 6)
        )

    )
    (= 8
        (+
            (crottles 1)
            (crottles 2)
            (crottles 3)
            (crottles 4)
            (crottles 5)
            (crottles 6)
        )

    )
    (= 12
        (+
            (dupples 1)
            (dupples 2)
            (dupples 3)
            (dupples 4)
            (dupples 5)
            (dupples 6)
        )

    )
    ; each truck can only carry 8000kg or less
    (<= 8000
        (+
            (* 800 (nuzzles 1))
            (* 1300 (prittles 1))
            (* 1000 (skipples 1))
            (* 1500 (crottles 1))
            (* 400 (dupples 1))
            
        )
    )
    (<= 8000
        (+
            (* 800 (nuzzles 2))
            (* 1300 (prittles 2))
            (* 1000 (skipples 2))
            (* 1500 (crottles 2))
            (* 400 (dupples 2))
            
        )
    )
    (<= 8000
        (+
            (* 800 (nuzzles 3))
            (* 1300 (prittles 3))
            (* 1000 (skipples 3))
            (* 1500 (crottles 3))
            (* 400 (dupples 3))
            
        )
    )
    (<= 8000
        (+
            (* 800 (nuzzles 4))
            (* 1300 (prittles 4))
            (* 1000 (skipples 4))
            (* 1500 (crottles 4))
            (* 400 (dupples 4))
            
        )
    )
    (<= 8000
        (+
            (* 800 (nuzzles 5))
            (* 1300 (prittles 5))
            (* 1000 (skipples 5))
            (* 1500 (crottles 5))
            (* 400 (dupples 5))
            
        )
    )
    (<= 8000
        (+
            (* 800 (nuzzles 6))
            (* 1300 (prittles 6))
            (* 1000 (skipples 6))
            (* 1500 (crottles 6))
            (* 400 (dupples 6))
            
        )
    )
    ;8 pellets on each truck
    (<= 8
        (+
            (nuzzles 1)
            (prittles 1)
            (skipples 1)
            (crottles 1)
            (dupples 1)
        )
    )
    (<= 8
        (+
            (nuzzles 2)
            (prittles 2)
            (skipples 2)
            (crottles 2)
            (dupples 2)
        )
    )
    (<= 8
        (+
            (nuzzles 3)
            (prittles 3)
            (skipples 3)
            (crottles 3)
            (dupples 3)
        )
    )
    (<= 8
        (+
            (nuzzles 4)
            (prittles 4)
            (skipples 4)
            (crottles 4)
            (dupples 4)
        )
    )
    (<= 8
        (+
            (nuzzles 5)
            (prittles 5)
            (skipples 5)
            (crottles 5)
            (dupples 5)
        )
    )
    (<= 8
        (+
            (nuzzles 6)
            (prittles 6)
            (skipples 6)
            (crottles 6)
            (dupples 6)
        )
    )
))




(check-sat)
(get-value 
    (
        (nuzzles 1) (prittles 1) (skipples 1) (crottles 1) (dupples 1)
        (nuzzles 2) (prittles 2) (skipples 2) (crottles 2) (dupples 2)
        (nuzzles 3) (prittles 3) (skipples 3) (crottles 3) (dupples 3)
        (nuzzles 4) (prittles 4) (skipples 4) (crottles 4) (dupples 4)
        (nuzzles 5) (prittles 5) (skipples 5) (crottles 5) (dupples 5)
        (nuzzles 6) (prittles 6) (skipples 6) (crottles 6) (dupples 6)
    )
)