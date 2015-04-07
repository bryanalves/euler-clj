(ns euler-clj.problem-001)

(defn multof [x n] (zero? (rem x n)))

(defn run []
  (->>
    (range 1000)
    (filter (fn [x]
              (or (multof x 3)
                  (multof x 5))))
    (reduce +)))
