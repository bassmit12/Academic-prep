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
(= (Coin 0 5) 6)
(= (Coin 0 6) 7)
(= (Coin 0 7) 9)
(= (Coin 0 8) 10)
(= (Coin 0 9) 12)


; Wanted end positions 
(= (Coin N 1) 13)


; no 2 coins can be on the same position
(forall ((t Int))
    (=> 
        (and (>= t 1)(<= t 20))
        (distinct (Coin t 1) (Coin t 2) (Coin t 3) (Coin t 4) (Coin t 5) (Coin t 6)(Coin t 7)(Coin t 8)(Coin t 9))
    )
)

; Only 1 coin can move each N
(forall ((t Int))
    (=> 
        (and (>= t 1)(<= t 20))
        (= 1 (+
            (ite (= (Coin t 1) (Coin (- t 1) 1)) 0 1)
            (ite (= (Coin t 2) (Coin (- t 1) 2)) 0 1)
            (ite (= (Coin t 3) (Coin (- t 1) 3)) 0 1)
            (ite (= (Coin t 4) (Coin (- t 1) 4)) 0 1)
            (ite (= (Coin t 5) (Coin (- t 1) 5)) 0 1)
            (ite (= (Coin t 6) (Coin (- t 1) 6)) 0 1)
            (ite (= (Coin t 7) (Coin (- t 1) 7)) 0 1)
            (ite (= (Coin t 8) (Coin (- t 1) 8)) 0 1)
            (ite (= (Coin t 9) (Coin (- t 1) 9)) 0 1)
            )
        )
    )
)

; Assert to what position you can move the following turn based on your current position
(forall ((t Int)(i Int))
    (=>
        (and 
            (>= t 1)(<= t 20)
            (>= i 1)(<= i 9)
        )
        (or 
        ; If the coin is in position 1, it can move to position 1 or 2
        (and (= (Coin (- t 1) i) 1) (or (= (Coin t i) 1) (= (Coin t i) 2)))
        
        ; If the coin is in position 2, it can move to position 1, 2, or 3
        (and (= (Coin (- t 1) i) 2) (or (= (Coin t i) 1) (= (Coin t i) 2) (= (Coin t i) 3)))
        
        ; If the coin is in position 3, it can move to position 2, 3, or 4
        (and (= (Coin (- t 1) i) 3) (or (= (Coin t i) 2) (= (Coin t i) 3) (= (Coin t i) 4)))
        
        ; If the coin is in position 4, it can move to position 3, 4, or 6
        (and (= (Coin (- t 1) i) 4) (or (= (Coin t i) 3) (= (Coin t i) 4) (= (Coin t i) 6)))
        
        ; If the coin is in position 5, it can move to position 4, 5
        (and (= (Coin (- t 1) i) 5) (or (= (Coin t i) 4) (= (Coin t i) 5)))
        
        ; If the coin is in position 6, it can move to position 4, 6, or 7
        (and (= (Coin (- t 1) i) 6) (or (= (Coin t i) 4) (= (Coin t i) 6) (= (Coin t i) 7)))
        
        ; If the coin is in position 7, it can move to position 6, 7, 8, or 9
        (and (= (Coin (- t 1) i) 7) (or (= (Coin t i) 6) (= (Coin t i) 7) (= (Coin t i) 8) (= (Coin t i) 9)))
        
        ; If the coin is in position 8, it can move to position 7, 8
        (and (= (Coin (- t 1) i) 8) (or (= (Coin t i) 7) (= (Coin t i) 8)))
        
        ; If the coin is in position 9, it can move to position 7, 9, or 10
        (and (= (Coin (- t 1) i) 9) (or (= (Coin t i) 7) (= (Coin t i) 9) (= (Coin t i) 10)))
        
        ; If the coin is in position 10, it can move to position 9, 10, 11 or 12
        (and (= (Coin (- t 1) i) 10) (or (= (Coin t i) 9) (= (Coin t i) 10) (= (Coin t i) 11) (= (Coin t i) 12)))
        
        ; If the coin is in position 11, it can move to position 10, 11
        (and (= (Coin (- t 1) i) 11) (or (= (Coin t i) 10) (= (Coin t i) 11)))
        
        ; If the coin is in position 12, it can move to position 10, 12, or 13
        (and (= (Coin (- t 1) i) 12) (or (= (Coin t i) 10) (= (Coin t i) 12) (= (Coin t i) 13)))
        
        ; If the coin is in position 13, it can move to position 12 or 13
        (and (= (Coin (- t 1) i) 13) (or (= (Coin t i) 12) (= (Coin t i) 13)))
      )

    )
)

;restrict the search to at most 10 steps, to prevent Z3 from searching forever
(<= 0 N 20)


))

(check-sat)
(get-value (N))
(get-value 
    (
        (Coin 0 1)
        (Coin 0 2)
        (Coin 0 3)
        (Coin 0 4)
        (Coin 0 5)
        (Coin 0 6)
        (Coin 0 7)
        (Coin 0 8)
        (Coin 0 9)
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
        (Coin 1 7)
        (Coin 1 8)
        (Coin 1 9)
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
        (Coin 2 7)
        (Coin 2 8)
        (Coin 2 9)
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
        (Coin 3 7)
        (Coin 3 8)
        (Coin 3 9)
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
        (Coin 4 7)
        (Coin 4 8)
        (Coin 4 9)
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
        (Coin 5 7)
        (Coin 5 8)
        (Coin 5 9)
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
        (Coin 6 7)
        (Coin 6 8)
        (Coin 6 9)
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
        (Coin 7 7)
        (Coin 7 8)
        (Coin 7 9)
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
        (Coin 8 7)
        (Coin 8 8)
        (Coin 8 9)
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
        (Coin 9 7)
        (Coin 9 8)
        (Coin 9 9)
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
        (Coin 10 7)
        (Coin 10 8)
        (Coin 10 9)
    )   
)
(echo "")
(get-value 
    (
        (Coin 11 1)
        (Coin 11 2)
        (Coin 11 3)
        (Coin 11 4)
        (Coin 11 5)
        (Coin 11 6)
        (Coin 11 7)
        (Coin 11 8)
        (Coin 11 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 12 1)
        (Coin 12 2)
        (Coin 12 3)
        (Coin 12 4)
        (Coin 12 5)
        (Coin 12 6)
        (Coin 12 7)
        (Coin 12 8)
        (Coin 12 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 13 1)
        (Coin 13 2)
        (Coin 13 3)
        (Coin 13 4)
        (Coin 13 5)
        (Coin 13 6)
        (Coin 13 7)
        (Coin 13 8)
        (Coin 13 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 14 1)
        (Coin 14 2)
        (Coin 14 3)
        (Coin 14 4)
        (Coin 14 5)
        (Coin 14 6)
        (Coin 14 7)
        (Coin 14 8)
        (Coin 14 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 15 1)
        (Coin 15 2)
        (Coin 15 3)
        (Coin 15 4)
        (Coin 15 5)
        (Coin 15 6)
        (Coin 15 7)
        (Coin 15 8)
        (Coin 15 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 16 1)
        (Coin 16 2)
        (Coin 16 3)
        (Coin 16 4)
        (Coin 16 5)
        (Coin 16 6)
        (Coin 16 7)
        (Coin 16 8)
        (Coin 16 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 17 1)
        (Coin 17 2)
        (Coin 17 3)
        (Coin 17 4)
        (Coin 17 5)
        (Coin 17 6)
        (Coin 17 7)
        (Coin 17 8)
        (Coin 17 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 18 1)
        (Coin 18 2)
        (Coin 18 3)
        (Coin 18 4)
        (Coin 18 5)
        (Coin 18 6)
        (Coin 18 7)
        (Coin 18 8)
        (Coin 18 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 19 1)
        (Coin 19 2)
        (Coin 19 3)
        (Coin 19 4)
        (Coin 19 5)
        (Coin 19 6)
        (Coin 19 7)
        (Coin 19 8)
        (Coin 19 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 20 1)
        (Coin 20 2)
        (Coin 20 3)
        (Coin 20 4)
        (Coin 20 5)
        (Coin 20 6)
        (Coin 20 7)
        (Coin 20 8)
        (Coin 20 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 21 1)
        (Coin 21 2)
        (Coin 21 3)
        (Coin 21 4)
        (Coin 21 5)
        (Coin 21 6)
        (Coin 21 7)
        (Coin 21 8)
        (Coin 21 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 22 1)
        (Coin 22 2)
        (Coin 22 3)
        (Coin 22 4)
        (Coin 22 5)
        (Coin 22 6)
        (Coin 22 7)
        (Coin 22 8)
        (Coin 22 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 23 1)
        (Coin 23 2)
        (Coin 23 3)
        (Coin 23 4)
        (Coin 23 5)
        (Coin 23 6)
        (Coin 23 7)
        (Coin 23 8)
        (Coin 23 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 24 1)
        (Coin 24 2)
        (Coin 24 3)
        (Coin 24 4)
        (Coin 24 5)
        (Coin 24 6)
        (Coin 24 7)
        (Coin 24 8)
        (Coin 24 9)
    )   
)
(echo "")

(get-value 
    (
        (Coin 25 1)
        (Coin 25 2)
        (Coin 25 3)
        (Coin 25 4)
        (Coin 25 5)
        (Coin 25 6)
        (Coin 25 7)
        (Coin 25 8)
        (Coin 25 9)
    )   
)
(echo "")



