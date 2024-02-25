; appearing letters: C, A, T, S, O, N, P, D, R, I, G, E


; Declare the dice function
(declare-fun dice (Bool Bool Bool) Bool)

; Define the dice function
(define-fun dice ((Letter1 Bool) (Letter2 Bool) (Letter3 Bool)) Bool
   (or 
      (and Letter1 (not Letter2) (not Letter3))
      (and Letter2 (not Letter1) (not Letter3))
      (and Letter3 (not Letter1) (not Letter2))
   )
)

; Assert the condition using the dice function
(assert (dice C A T))

(check-sat)
(get-model)






