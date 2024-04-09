; (time, coin) -> position
(declare-fun Coin (Int Int) Int)

; timepoint at which the required end-state is reached
(declare-const N Int)

(assert (and

; Begin positions of coins
(= (Coin 0 1) 1)
(= (Coin 0 2) 2)
(= (Coin 0 3) 3)
(= (Coin 0 4) 4)
; position 5 is above 4
(= (Coin 0 5) 6)
(= (Coin 0 6) 7)
; position 8 is above 7
(= (Coin 0 7) 9)
(= (Coin 0 8) 10)
; position 11 is above 10
(= (Coin 0 9) 12)


; Wanted end positions 
(= (Coin 0 1) 13)


; no 2 coins can be on the same position
;(forall ((N Int))
;    (distinct (Coin N 1) (Coin N 2) (Coin N 3) (Coin N 4) (Coin N 5) (Coin N 6)(Coin N 7)(Coin N 8)(Coin N 9))
;)

; Only 1 coin can move each N
(forall ((N Int))
        (= 1 (+
                (ite (not (= (select Coin N 1) (select Coin (- N 1) 1))) 1 0)
                (ite (not (= (select Coin N 2) (select Coin (- N 1) 2))) 1 0)
                (ite (not (= (select Coin N 3) (select Coin (- N 1) 3))) 1 0)
                (ite (not (= (select Coin N 4) (select Coin (- N 1) 4))) 1 0)
                (ite (not (= (select Coin N 5) (select Coin (- N 1) 5))) 1 0)
                (ite (not (= (select Coin N 6) (select Coin (- N 1) 6))) 1 0)
                (ite (not (= (select Coin N 7) (select Coin (- N 1) 7))) 1 0)
                (ite (not (= (select Coin N 8) (select Coin (- N 1) 8))) 1 0)
                (ite (not (= (select Coin N 9) (select Coin (- N 1) 9))) 1 0)
            )
        )
    )

; All positions are between 1 and 12
(forall ((N Int) (i Int))
    (=> (and (<= 1 i) (<= i 12))
    (and (<= 1 (Coin N i)) (<= (Coin N i) 12)))
)

; for each N, all coins can move 1 or 0 positions based on their previous position
(forall ((N Int))
    (forall ((i Int))
        (or
            (= (abs (- (select Coin N i) (select Coin (- N 1) i))) 0) ; Coin doesn't move
            (= (abs (- (select Coin N i) (select Coin (- N 1) i))) 1) ; Coin moves by 1 position
        )
    )
)

;restrict the search to at most 10 steps, to prevent Z3 from searching forever
(<= 0 N 15)

))

(check-sat)
(get-value 
    (
        (Coin 0 1)
        (Coin 0 2)
        (Coin 0 3)
        (Coin 0 4)
        (Coin 0 5)
        (Coin 0 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 1 1)
        (Coin 1 2)
        (Coin 1 3)
        (Coin 1 4)
        (Coin 1 5)
        (Coin 1 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 2 1)
        (Coin 2 2)
        (Coin 2 3)
        (Coin 2 4)
        (Coin 2 5)
        (Coin 2 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 3 1)
        (Coin 3 2)
        (Coin 3 3)
        (Coin 3 4)
        (Coin 3 5)
        (Coin 3 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 4 1)
        (Coin 4 2)
        (Coin 4 3)
        (Coin 4 4)
        (Coin 4 5)
        (Coin 4 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 5 1)
        (Coin 5 2)
        (Coin 5 3)
        (Coin 5 4)
        (Coin 5 5)
        (Coin 5 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 6 1)
        (Coin 6 2)
        (Coin 6 3)
        (Coin 6 4)
        (Coin 6 5)
        (Coin 6 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 7 1)
        (Coin 7 2)
        (Coin 7 3)
        (Coin 7 4)
        (Coin 7 5)
        (Coin 7 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 8 1)
        (Coin 8 2)
        (Coin 8 3)
        (Coin 8 4)
        (Coin 8 5)
        (Coin 8 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 9 1)
        (Coin 9 2)
        (Coin 9 3)
        (Coin 9 4)
        (Coin 9 5)
        (Coin 9 6)
    )   
)
(echo "")

(get-value 
    (
        (Coin 10 1)
        (Coin 10 2)
        (Coin 10 3)
        (Coin 10 4)
        (Coin 10 5)
        (Coin 10 6)
    )   
)
(echo "")
