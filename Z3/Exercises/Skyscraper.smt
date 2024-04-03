(declare-fun coordinate (Int Int) Int)

; You can always see the first tower
(define-fun seeTowersFromTop ((xCoordinate Int)) Int
    (+ 1
        ; can you see the second tower
        (ite (> (coordinate xCoordinate 2) (coordinate xCoordinate 1)) 1 0)
        ;can see the third tower
        (ite (and (> (coordinate xCoordinate 3) (coordinate xCoordinate 2)) (> (coordinate xCoordinate 3) (coordinate xCoordinate 1))) 1 0)
        ;can see the fourth tower
        (ite (and (> (coordinate xCoordinate 4) (coordinate xCoordinate 3)) (> (coordinate xCoordinate 4) (coordinate xCoordinate 2)) (> (coordinate xCoordinate 4) (coordinate xCoordinate 1))) 1 0)
        ;can see the fifth tower
        (ite (and (> (coordinate xCoordinate 5) (coordinate xCoordinate 4)) (> (coordinate xCoordinate 5) (coordinate xCoordinate 3)) (> (coordinate xCoordinate 5) (coordinate xCoordinate 2)) (> (coordinate xCoordinate 5) (coordinate xCoordinate 1))) 1 0)
    )
    
)

(define-fun seeTowersFromBottom ((xCoordinate Int)) Int
    (+ 1
        ; can you see the second tower
        (ite (> (coordinate xCoordinate 4) (coordinate xCoordinate 5)) 1 0)
        ;can see the third tower
        (ite (and (> (coordinate xCoordinate 3) (coordinate xCoordinate 4)) (> (coordinate xCoordinate 3) (coordinate xCoordinate 5))) 1 0)
        ;can see the fourth tower
        (ite (and (> (coordinate xCoordinate 2) (coordinate xCoordinate 5)) (> (coordinate xCoordinate 2) (coordinate xCoordinate 4)) (> (coordinate xCoordinate 2) (coordinate xCoordinate 3))) 1 0)
        ;can see the fifth tower
        (ite (and (> (coordinate xCoordinate 1) (coordinate xCoordinate 5)) (> (coordinate xCoordinate 1) (coordinate xCoordinate 4)) (> (coordinate xCoordinate 1) (coordinate xCoordinate 3)) (> (coordinate xCoordinate 1) (coordinate xCoordinate 2))) 1 0)
    )
    
)

(define-fun seeTowersFromLeft ((yCoordinate Int)) Int
    (+ 1
        ; can you see the second tower
        (ite (> (coordinate 2 yCoordinate) (coordinate 1 yCoordinate)) 1 0)
        ; can you see the third tower
        (ite (and (> (coordinate 3 yCoordinate) (coordinate 2 yCoordinate)) (> (coordinate 3 yCoordinate) (coordinate 1 yCoordinate))) 1 0)
        ; can you see the fourth tower
        (ite (and (> (coordinate 4 yCoordinate) (coordinate 3 yCoordinate)) (> (coordinate 4 yCoordinate) (coordinate 2 yCoordinate)) (> (coordinate 4 yCoordinate) (coordinate 1 yCoordinate))) 1 0)
        ; can you see the fifth tower
        (ite (and (> (coordinate 5 yCoordinate) (coordinate 4 yCoordinate)) (> (coordinate 5 yCoordinate) (coordinate 3 yCoordinate)) (> (coordinate 5 yCoordinate) (coordinate 2 yCoordinate)) (> (coordinate 5 yCoordinate) (coordinate 1 yCoordinate))) 1 0)
    )
)

(define-fun seeTowersFromRight ((yCoordinate Int)) Int
    (+ 1
        ; can you see the second tower
        (ite (> (coordinate 4 yCoordinate) (coordinate 5 yCoordinate)) 1 0)
        ; can you see the third tower
        (ite (and (> (coordinate 3 yCoordinate) (coordinate 4 yCoordinate)) (> (coordinate 3 yCoordinate) (coordinate 5 yCoordinate))) 1 0)
        ; can you see the fourth tower
        (ite (and (> (coordinate 2 yCoordinate) (coordinate 5 yCoordinate)) (> (coordinate 2 yCoordinate) (coordinate 4 yCoordinate)) (> (coordinate 2 yCoordinate) (coordinate 3 yCoordinate))) 1 0)
        ; can you see the fifth tower
        (ite (and (> (coordinate 1 yCoordinate) (coordinate 5 yCoordinate)) (> (coordinate 1 yCoordinate) (coordinate 4 yCoordinate)) (> (coordinate 1 yCoordinate) (coordinate 3 yCoordinate)) (> (coordinate 1 yCoordinate) (coordinate 2 yCoordinate))) 1 0)
    )
)

(assert 
    (forall ((i Int)(j Int))
        (implies 
            (and 
                (>= i 1) 
                (<= i 5)
                (>= j 1) 
                (<= j 5)
            ) 
            (and 
                (>= (coordinate i j) 1) 
                (<= (coordinate i j) 5) 
            )
        )
    )
)

; each number in column is unique
(assert 
    (forall ((i Int))
        (implies
            (and 
                (>= i 1) 
                (<= i 5)
            )

            (distinct (coordinate i 1)(coordinate i 2)(coordinate i 3)(coordinate i 4)(coordinate i 5))
        )
    )
)

; each number in row is unique
(assert 
    (forall ((j Int))
        (implies
            (and 
                (>= j 1) 
                (<= j 5)
            )

            (distinct (coordinate 1 j)(coordinate 2 j)(coordinate 3 j)(coordinate 4 j)(coordinate 5 j))
        )
    )
)

(assert (= (seeTowersFromLeft 1) 2))
(assert (= (seeTowersFromLeft 2) 2))
;(assert (= (seeTowersFromLeft 3) 3))
(assert (= (seeTowersFromLeft 4) 2))
;(assert (= (seeTowersFromLeft 5) 2))

;(assert (= (seeTowersFromRight 1) 3))
(assert (= (seeTowersFromRight 2) 3))
;(assert (= (seeTowersFromRight 3) 4))
;(assert (= (seeTowersFromRight 4) 3))
;(assert (= (seeTowersFromRight 5) 2))

;(assert (= (seeTowersFromTop 1) 5))
;(assert (= (seeTowersFromTop 2) 4))
;(assert (= (seeTowersFromTop 3) 5))
(assert (= (seeTowersFromTop 4) 3))
;(assert (= (seeTowersFromTop 5) 5))

;(assert (= (seeTowersFromBottom 1) 2))
;(assert (= (seeTowersFromBottom 2) 5))
(assert (= (seeTowersFromBottom 3) 2))
(assert (= (seeTowersFromBottom 4) 1))
(assert (= (seeTowersFromBottom 5) 4))



(check-sat)
(echo "Getting values for coordinate (1,1) to (1,5)")
(get-value 
    (
        (coordinate 1 1)
        (coordinate 1 2)
        (coordinate 1 3)
        (coordinate 1 4)
        (coordinate 1 5)
    )
)
(echo "")

(echo "Getting values for coordinate (2,1) to (2,5)")
(get-value 
    (
        (coordinate 2 1)
        (coordinate 2 2)
        (coordinate 2 3)
        (coordinate 2 4)
        (coordinate 2 5)
    )
)
(echo "")

(echo "Getting values for coordinate (3,1) to (3,5)")
(get-value 
    (
        (coordinate 3 1)
        (coordinate 3 2)
        (coordinate 3 3)
        (coordinate 3 4)
        (coordinate 3 5)
    )
)
(echo "")

(echo "Getting values for coordinate (4,1) to (4,5)")
(get-value 
    (
        (coordinate 4 1)
        (coordinate 4 2)
        (coordinate 4 3)
        (coordinate 4 4)
        (coordinate 4 5)
    )
)
(echo "")

(echo "Getting values for coordinate (5,1) to (5,5)")
(get-value 
    (
        (coordinate 5 1)
        (coordinate 5 2)
        (coordinate 5 3)
        (coordinate 5 4)
        (coordinate 5 5)
    )
)

