(declare-const A Bool)
(declare-const B Bool)
(declare-const C Bool)
(declare-const D Bool)
(declare-const E Bool)

(assert (and
    (implies (not A)(and B D))
    (or (not B)(not C) E)
    (not (and (implies (not C)(or (not A)B))(implies (or (not A)B) (not C))))
    (not E)
    D
))


(check-sat)
(get-model)