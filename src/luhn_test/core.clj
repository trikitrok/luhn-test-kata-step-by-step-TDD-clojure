(ns luhn-test.core)

(defn- reduce-numbers [numbers]
  (apply + (map-indexed #(if (even? %1) %2 (* 2 %2)) numbers)))

(defn valid? [digits]
  (let [numbers (map #(Integer/parseInt (str %)) (reverse digits))]
    (or (= 0 (reduce-numbers numbers))
        (= 10 (reduce-numbers numbers))
        (= 20 (reduce-numbers numbers)))))
