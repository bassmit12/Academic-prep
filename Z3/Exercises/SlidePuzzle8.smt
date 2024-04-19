

; (time, number) -> position
(declare-fun Number (Int Int) Int)

; timepoint at which the required end-state is reached
(declare-const N Int)

(assert (and 
    ; Begin positions of numbers
    (= (Number 0 8) 1)
    (= (Number 0 7) 2)
    (= (Number 0 6) 3)
    (= (Number 0 5) 4 )
    (= (Number 0 4) 5 )
    (= (Number 0 3) 6 )
    (= (Number 0 2) 7 )
    (= (Number 0 1) 8 )

    ; Wanted end positions of numbers (N=16 found by 1 2 4)
    ;(= (Number N 1) 1)
    ;(= (Number N 2) 2)
    ;(= (Number N 3) 3)
    (= (Number N 4) 4 )
    (= (Number N 5) 5 )
    ;(= (Number N 6) 6 )
    ;(= (Number N 7) 7 )
    ;(= (Number N 8) 8 )

    ; 2 numbers cant be on the same position
    (forall ((t Int))
        (=> (<= 1 t N)
            (distinct (Number t 1)(Number t 2)(Number t 3)(Number t 4)(Number t 5)(Number t 6)(Number t 7)(Number t 8))
        )
    )

    ; cant change more then 3 for each N
    (forall ((t Int) (i Int))
        (=> (and (>= t 1) (<= t N) (>= i 1) (<= i 8))  
            (<= (abs (- (Number t i) (Number (- t 1) i))) 3)
        )
    )

    ; Position must be between 1 and 9
    (forall ((t Int) (i Int))
        (=> (and (>= t 1) (<= t N) (>= i 1) (<= i 8))  
            (and (>= (Number t i) 1) (<= (Number t i) 9))  
        )
    )

    ; Only 1 number can change position each N
    (forall ((t Int))
        (=>
            (and
                (<= 1 t N)
            )
            (= 1
                (+
                    (ite (= (Number t 1) (Number (- t 1) 1)) 0 1)
                    (ite (= (Number t 2) (Number (- t 1) 2)) 0 1)
                    (ite (= (Number t 3) (Number (- t 1) 3)) 0 1)
                    (ite (= (Number t 4) (Number (- t 1) 4)) 0 1)
                    (ite (= (Number t 5) (Number (- t 1) 5)) 0 1)
                    (ite (= (Number t 6) (Number (- t 1) 6)) 0 1)
                    (ite (= (Number t 7) (Number (- t 1) 7)) 0 1)
                    (ite (= (Number t 8) (Number (- t 1) 8)) 0 1)
                )
            )
        )
    )

    ; Define the possible movements for a number on a 3x3 grid from positions 1 to 9
    (forall ((t Int)(i Int))
        (=> 
            (and
            (<= 1 t N) 
            (<= 1 i 8) 
            )
            (or
            ; If the number is in position 1, it can stay in 1, move to 2 or 4
            (and (= (Number t i) 1) (or (= (Number (- t 1) i) 1) (= (Number (- t 1) i) 2) (= (Number (- t 1) i) 4)))
            
            ; If the number is in position 2, it can stay in 2, move to 1, 3, or 5
            (and (= (Number t i) 2) (or (= (Number (- t 1) i) 2) (= (Number (- t 1) i) 1) (= (Number (- t 1) i) 3) (= (Number (- t 1) i) 5)))
            
            ; If the number is in position 3, it can stay in 3, move to 2 or 6
            (and (= (Number t i) 3) (or (= (Number (- t 1) i) 3) (= (Number (- t 1) i) 2) (= (Number (- t 1) i) 6)))
            
            ; If the number is in position 4, it can stay in 4, move to 1, 5, or 7
            (and (= (Number t i) 4) (or (= (Number (- t 1) i) 4) (= (Number (- t 1) i) 1) (= (Number (- t 1) i) 5) (= (Number (- t 1) i) 7)))
            
            ; If the number is in position 5, it can stay in 5, move to 2, 4, 6, or 8
            (and (= (Number t i) 5) (or (= (Number (- t 1) i) 5) (= (Number (- t 1) i) 2) (= (Number (- t 1) i) 4) (= (Number (- t 1) i) 6) (= (Number (- t 1) i) 8)))
            
            ; If the number is in position 6, it can stay in 6, move to 3, 5, or 9
            (and (= (Number t i) 6) (or (= (Number (- t 1) i) 6) (= (Number (- t 1) i) 3) (= (Number (- t 1) i) 5) (= (Number (- t 1) i) 9)))
            
            ; If the number is in position 7, it can stay in 7, move to 4 or 8
            (and (= (Number t i) 7) (or (= (Number (- t 1) i) 7) (= (Number (- t 1) i) 4) (= (Number (- t 1) i) 8)))
            
            ; If the number is in position 8, it can stay in 8, move to 7, 5, or 9
            (and (= (Number t i) 8) (or (= (Number (- t 1) i) 8) (= (Number (- t 1) i) 7) (= (Number (- t 1) i) 5) (= (Number (- t 1) i) 9)))
            
            ; If the number is in position 9, it can stay in 9, move to 6 or 8
            (and (= (Number t i) 9) (or (= (Number (- t 1) i) 9) (= (Number (- t 1) i) 6) (= (Number (- t 1) i) 8)))
            )
        )
    )


    ;restrict the search to at most 10 steps, to prevent Z3 from searching forever
    (<= 0 N 200)


))

(check-sat)
(get-value (N))
(get-value 
    (
        (Number 0 1)
        (Number 0 2)
        (Number 0 3)
        (Number 0 4)
        (Number 0 5)
        (Number 0 6)
        (Number 0 7)
        (Number 0 8)
    )   
)
(echo "")

(get-value 
    (
        (Number 1 1)
        (Number 1 2)
        (Number 1 3)
        (Number 1 4)
        (Number 1 5)
        (Number 1 6)
        (Number 1 7)
        (Number 1 8)
    )   
)
(echo "")

(get-value 
    (
        (Number N 1)
        (Number N 2)
        (Number N 3)
        (Number N 4)
        (Number N 5)
        (Number N 6)
        (Number N 7)
        (Number N 8)
    )   
)
(echo "")

