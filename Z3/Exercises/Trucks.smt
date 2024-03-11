(declare-const nuzzles Int)
(declare-const prittles Int)
(declare-const skipples Int)
(declare-const crottles Int)
(declare-const dupples Int)

;(declare-const truckAmount Int)

(define-fun trucks((nuzzlesAmount Int)(prittlesAmount Int)(skipplesAmount Int)(crottlesAmount Int)(dupplesAmount Int)(truckAmount Int)) Bool
    ; Should run 6 times
        (and (<= 8000
            (+
            (* nuzzlesAmount 800)
            (* prittlesAmount 1300)
            (* prittlesAmount 1000)
            (* prittlesAmount 1500)
            (* prittlesAmount 400)
            )
            (
                <= nuzzlesAmount 1
            )
            (<= 8
                (+ nuzzlesAmount prittlesAmount skipplesAmount crottlesAmount dupplesAmount)
            )
            
        ))
    
)

(assert (= nuzzles 4))
(assert (>= prittles 1))
(assert (= skipples 8))
(assert (= crottles 8))
(assert (= dupples 12))

;(assert (= truckAmount 8))

(assert (trucks nuzzles prittles skipples crottles dupples truckAmount))


(check-sat)
(get-model)

