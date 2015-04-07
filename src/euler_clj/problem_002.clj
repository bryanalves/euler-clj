(ns euler-clj.problem-002)

(def fib-seq
  (lazy-cat [0 1] (map + (rest fib-seq) fib-seq)))

(defn multof [x n] (zero? (rem x n)))

(defn run []
  (->>
    (take-while #(< % 4000000) fib-seq)
    (filter #(multof % 2))
    (reduce +)))
