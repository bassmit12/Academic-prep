(declare-const nuzzles Int)
(declare-const prittles Int)
(declare-const skipples Int)
(declare-const crottles Int)
(declare-const dupples Int)


(define-fun truck((nuzzlesAmount Int)(prittlesAmount Int)(skipplesAmount Int)(crottlesAmount Int)(dupplesAmount Int)) Bool
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
        (= 8
            (+ nuzzlesAmount prittlesAmount skipplesAmount crottlesAmount dupplesAmount)
        )
        
    ))
)

(assert (= nuzzles 4))
(assert (>= prittles 1))
(assert (= skipples 8))
(assert (= crottles 8))
(assert (= dupples 12))

(check-sat)


