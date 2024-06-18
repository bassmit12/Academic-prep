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
    (<= 1
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
    ; cant have negative amount on a truck
    (and
        (>= (nuzzles 1) 0) (>= (nuzzles 2) 0) (>= (nuzzles 3) 0) (>= (nuzzles 4) 0) (>= (nuzzles 5) 0) (>= (nuzzles 6) 0)
        (>= (prittles 1) 0) (>= (prittles 2) 0) (>= (prittles 3) 0) (>= (prittles 4) 0) (>= (prittles 5) 0) (>= (prittles 6) 0)
        (>= (skipples 1) 0) (>= (skipples 2) 0) (>= (skipples 3) 0) (>= (skipples 4) 0) (>= (skipples 5) 0) (>= (skipples 6) 0)
        (>= (crottles 1) 0) (>= (crottles 2) 0) (>= (crottles 3) 0) (>= (crottles 4) 0) (>= (crottles 5) 0) (>= (crottles 6) 0)
        (>= (dupples 1) 0) (>= (dupples 2) 0) (>= (dupples 3) 0) (>= (dupples 4) 0) (>= (dupples 5) 0) (>= (dupples 6) 0)
    )
    ; no 2 nuzzles may be on the same truck
    (and
        (< (nuzzles 1) 2) (< (nuzzles 2) 2) (< (nuzzles 3) 2) (< (nuzzles 4) 2) (< (nuzzles 5) 2) (< (nuzzles 6) 2)
    )
    ; only 2 trucks can carry skipples
    (<= 2
        (+
            (ite (> (skipples 1) 0) 1 0)
            (ite (> (skipples 2) 0) 1 0)
            (ite (> (skipples 3) 0) 1 0)
            (ite (> (skipples 4) 0) 1 0)
            (ite (> (skipples 5) 0) 1 0)
            (ite (> (skipples 6) 0) 1 0)
        )
    )
))


(maximize (nuzzles 1))
(maximize (nuzzles 2))
(maximize (nuzzles 3))
(maximize (nuzzles 4))
(maximize (nuzzles 5))

(maximize (prittles 1))
(maximize (prittles 2))
(maximize (prittles 3))
(maximize (prittles 4))
(maximize (prittles 5))

(maximize (skipples 1))
(maximize (skipples 2))
(maximize (skipples 3))
(maximize (skipples 4))
(maximize (skipples 5))

(maximize (crottles 1))
(maximize (crottles 2))
(maximize (crottles 3))
(maximize (crottles 4))
(maximize (crottles 5))

(maximize (dupples 1))
(maximize (dupples 2))
(maximize (dupples 3))
(maximize (dupples 4))
(maximize (dupples 5))




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