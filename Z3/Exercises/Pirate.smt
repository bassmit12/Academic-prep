; (time) -> position gold
(declare-fun Gold (Int) Int)

; (time) -> position ship
(declare-fun Ship (Int) Int)

; timepoint at which the required end-state is reached
(declare-const N Int)

(assert (and

;wanted end state
(= (Gold N) (Ship N))

; Gold can start on any position
(or (= (Gold 0) 1) 
            (= (Gold 0) 2) 
            (= (Gold 0) 3) 
            (= (Gold 0) 4) 
            (= (Gold 0) 5))

; Restricting the Gold variable to values from 1 to 5 for all times
(forall ((N Int)) (and (>= (Gold N) 1) (<= (Gold N) 5)))

; Restricting the Ship variable to values from 1 to 5 for all times
(forall ((N Int)) (and (>= (Ship N) 1) (<= (Ship N) 5)))

; The gold must move exactly 1 position each N
(forall ((N Int))
    (=> (> N 0)
        (= (abs (- (Gold N) (Gold (- N 1)))) 1)))

; restrict Z3 to 10 max steps
(<= 0 N 10)

))

(check-sat)
(get-value 
    (
        (Gold 0)
        (Ship 0)
    )   
)
(echo "")
(get-value 
    (
        (Gold 1)
        (Ship 1)
    )   
)
(echo "")
(get-value 
    (
        (Gold 2)
        (Ship 2)
    )   
)
(echo "")
(get-value 
    (
        (Gold 3)
        (Ship 3)
    )   
)
(echo "")
(get-value 
    (
        (Gold 4)
        (Ship 4)
    )   
)
(echo "")
(get-value 
    (
        (Gold 5)
        (Ship 5)
    )   
)
(echo "")
(get-value 
    (
        (Gold 6)
        (Ship 6)
    )   
)
(echo "")
(get-value 
    (
        (Gold 7)
        (Ship 7)
    )   
)
(echo "")
(get-value 
    (
        (Gold 8)
        (Ship 8)
    )   
)
(echo "")
(get-value 
    (
        (Gold 9)
        (Ship 9)
    )   
)
(echo "")
(get-value 
    (
        (Gold 10)
        (Ship 10)
    )   
)
(echo "")




