; (time, frog) -> position
(declare-fun Frog (Int Int) Int)

; timepoint at which the required end-state is reached
(declare-const N Int)

(define-fun frogOnPosition ((pos Int) (N Int)) Bool
  (or (= (Frog N 1) pos)
      (= (Frog N 2) pos)
      (= (Frog N 3) pos)
      (= (Frog N 4) pos)
      (= (Frog N 5) pos)
      (= (Frog N 6) pos)
  )
)

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
(=> (and (<= 1 N) (<= N 10))
    (distinct (Frog N 1) (Frog N 2) (Frog N 3) (Frog N 4) (Frog N 5) (Frog N 6)))
)

; min value is always -3 and max value is always 3
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 10))
      (forall ((i Int))
        (=> (and (<= 1 i) (<= i 6))
          (and (>= (Frog N i) -3) (<= (Frog N i) 3))))
    )
)

; all allowed positions for frog 1
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 10))
      (and (>= (Frog N 1) -3) (<= (Frog N 1) 3))
    )
)

; all allowed positions for frog 2
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 10))
      (and (>= (Frog N 3) -2) (<= (Frog N 3) 3))
    )
)

; all allowed positions for frog 3
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 10))
      (and (>= (Frog N 3) -1) (<= (Frog N 3) 3))
    )
)

; all allowed positions for frog 4
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 10))
      (and (>= (Frog N 4) -3) (<= (Frog N 4) 1))
    )
)

; all allowed positions for frog 5
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 10))
      (and (>= (Frog N 5) -3) (<= (Frog N 5) 2))
    )
)

; all allowed positions for frog 6
(forall ((N Int))
    (=> (and (<= 1 N) (<= N 10))
      (and (>= (Frog N 6) -3) (<= (Frog N 6) 3))
    )
)

; frogs 1 2 3 can only move forward or sit still
(forall ((N Int))
    (=> (and (<= 2 N) (<= N 10))
      (and
        (>= (Frog N 1) (Frog (- N 1) 1))
        (>= (Frog N 2) (Frog (- N 1) 2))
        (>= (Frog N 3) (Frog (- N 1) 3))
      )
    )
)

; frogs 1 2 3 can only move backwards or sit still
(forall ((N Int))
    (=> (and (<= 2 N) (<= N 10))
      (and
        (<= (Frog N 4) (Frog (- N 1) 4))
        (<= (Frog N 5) (Frog (- N 1) 5))
        (<= (Frog N 6) (Frog (- N 1) 6))
      )
    )
)



;restrict the search to at most 10 steps, to prevent Z3 from searching forever
(<= 0 N 10)


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
        (Frog 10 1)
        (Frog 10 2)
        (Frog 10 3)
        (Frog 10 4)
        (Frog 10 5)
        (Frog 10 6)

    )   
)
(echo "")
