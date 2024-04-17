; (time, frog) -> position
(declare-fun Frog (Int Int) Int)

; timepoint at which the required end-state is reached
(declare-const N Int)

(assert (and 

; Begin positions of frogs
(= (Frog 0 1) -3)
(= (Frog 0 2) -2)
(= (Frog 0 3) -1)
(= (Frog 0 4) 1 )
(= (Frog 0 5) 2 )
(= (Frog 0 6) 3 )

; Wanted end state for frog 1, 2 and 3
(forall ((i Int)) 
    (=> 
        (and (<= 1 i) (<= i 3))
        (or (= (Frog N i) -3)
            (= (Frog N i) -2)
            (= (Frog N i) -1))
    )
)
; Wanted end state for frog 4, 5 and 6
(forall ((i Int)) 
    (=> 
    (and (<= 4 i) (<= i 6))
    (or (= (Frog N i) 1)
        (= (Frog N i) 2)
        (= (Frog N i) 3))
    )
)


; no 2 frogs can be on the same position
(forall ((N Int))
(=> (and (<= 0 N) (<= N 15))
    (distinct (Frog N 1) (Frog N 2) (Frog N 3) (Frog N 4) (Frog N 5) (Frog N 6)))
)

; min value is always -3 and max value is always 3
(forall ((N Int))
    (=> (and (<= 0 N) (<= N 15))
      (forall ((i Int))
        (=> (and (<= 1 i) (<= i 6))
          (and (>= (Frog N i) -3) (<= (Frog N i) 3))))
    )
)

; all allowed positions for frog 1
(forall ((N Int))
    (=> (and (<= 0 N) (<= N 15))
      (and (>= (Frog N 1) -3) (<= (Frog N 1) 3))
    )
)

; all allowed positions for frog 2
(forall ((N Int))
    (=> (and (<= 0 N) (<= N 15))
      (and (>= (Frog N 3) -2) (<= (Frog N 3) 3))
    )
)

; all allowed positions for frog 3
(forall ((N Int))
    (=> (and (<= 0 N) (<= N 15))
      (and (>= (Frog N 3) -1) (<= (Frog N 3) 3))
    )
)

; all allowed positions for frog 4
(forall ((N Int))
    (=> (and (<= 0 N) (<= N 15))
      (and (>= (Frog N 4) -3) (<= (Frog N 4) 1))
    )
)

; all allowed positions for frog 5
(forall ((N Int))
    (=> (and (<= 0 N) (<= N 15))
      (and (>= (Frog N 5) -3) (<= (Frog N 5) 2))
    )
)

; all allowed positions for frog 6
(forall ((N Int))
    (=> (and (<= 0 N) (<= N 15))
      (and (>= (Frog N 6) -3) (<= (Frog N 6) 3))
    )
)

; frogs 1 2 3 can only move forward or sit still
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 15))
      (and
        (>= (Frog N 1) (Frog (- N 1) 1))
        (>= (Frog N 2) (Frog (- N 1) 2))
        (>= (Frog N 3) (Frog (- N 1) 3))
      )
    )
)

; frogs 1 2 3 can only move backwards or sit still
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 15))
      (and
        (<= (Frog N 4) (Frog (- N 1) 4))
        (<= (Frog N 5) (Frog (- N 1) 5))
        (<= (Frog N 6) (Frog (- N 1) 6))
      )
    )
)

; only 1 Frog can move each N
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 15))
        (= 1
            (+ (ite (= (Frog N 1) (Frog (- N 1) 1)) 0 1)
                (ite (= (Frog N 2) (Frog (- N 1) 2)) 0 1)
                (ite (= (Frog N 3) (Frog (- N 1) 3)) 0 1)
                (ite (= (Frog N 4) (Frog (- N 1) 4)) 0 1)
                (ite (= (Frog N 5) (Frog (- N 1) 5)) 0 1)
                (ite (= (Frog N 6) (Frog (- N 1) 6)) 0 1)
            )
        )
    )
)

; A frog can either sit still or move at max 2 spots
(forall ((N Int)(i Int))
    (=> (and (<= 1 N) (<= N 15) (<= 1 i) (<= i 6))
      (and
        (or
          (<= (abs (- (Frog (+ N 1) i) (Frog N i))) 2)
          (= (Frog (+ N 1) i) (Frog N i)))
      )
    )
)



;restrict the search to at most 10 steps, to prevent Z3 from searching forever
(<= 0 N 15)


))



(check-sat)
(get-value 
    (
        (Frog 0 1)
        (Frog 0 2)
        (Frog 0 3)
        (Frog 0 4)
        (Frog 0 5)
        (Frog 0 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 1 1)
        (Frog 1 2)
        (Frog 1 3)
        (Frog 1 4)
        (Frog 1 5)
        (Frog 1 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 2 1)
        (Frog 2 2)
        (Frog 2 3)
        (Frog 2 4)
        (Frog 2 5)
        (Frog 2 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 3 1)
        (Frog 3 2)
        (Frog 3 3)
        (Frog 3 4)
        (Frog 3 5)
        (Frog 3 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 4 1)
        (Frog 4 2)
        (Frog 4 3)
        (Frog 4 4)
        (Frog 4 5)
        (Frog 4 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 5 1)
        (Frog 5 2)
        (Frog 5 3)
        (Frog 5 4)
        (Frog 5 5)
        (Frog 5 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 6 1)
        (Frog 6 2)
        (Frog 6 3)
        (Frog 6 4)
        (Frog 6 5)
        (Frog 6 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 7 1)
        (Frog 7 2)
        (Frog 7 3)
        (Frog 7 4)
        (Frog 7 5)
        (Frog 7 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 8 1)
        (Frog 8 2)
        (Frog 8 3)
        (Frog 8 4)
        (Frog 8 5)
        (Frog 8 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 9 1)
        (Frog 9 2)
        (Frog 9 3)
        (Frog 9 4)
        (Frog 9 5)
        (Frog 9 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 10 1)
        (Frog 10 2)
        (Frog 10 3)
        (Frog 10 4)
        (Frog 10 5)
        (Frog 10 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 11 1)
        (Frog 11 2)
        (Frog 11 3)
        (Frog 11 4)
        (Frog 11 5)
        (Frog 11 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 12 1)
        (Frog 12 2)
        (Frog 12 3)
        (Frog 12 4)
        (Frog 12 5)
        (Frog 12 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 13 1)
        (Frog 13 2)
        (Frog 13 3)
        (Frog 13 4)
        (Frog 13 5)
        (Frog 13 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 14 1)
        (Frog 14 2)
        (Frog 14 3)
        (Frog 14 4)
        (Frog 14 5)
        (Frog 14 6)
    )   
)
(echo "")

(get-value 
    (
        (Frog 15 1)
        (Frog 15 2)
        (Frog 15 3)
        (Frog 15 4)
        (Frog 15 5)
        (Frog 15 6)
    )   
)
(echo "")





