(ns luhn-test.core)

(defn valid? [digits]
  (let [numbers (map #(Integer/parseInt (str %)) (reverse digits))]
    (if (= 1 (count numbers))
      (zero? (first numbers))
      (= 10 (+ (first numbers)
               (get (vec numbers) 2 0)
               (* 2 (second numbers))
               (* 2 (get (vec numbers) 3 0)))))))
