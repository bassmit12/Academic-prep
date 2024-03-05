(declare-fun isDivisible (Int Int) Bool)

(define-fun primeNumber ((number Int)) Bool
  (ite (<= number 1) false
    (forall ((i Int))
      (=> (and (>= i 2) (<= i (sqrt number)) (isDivisible number i)) false))
  )
)

(assert primeNumber 5)

(check-sat)
(get-model)
