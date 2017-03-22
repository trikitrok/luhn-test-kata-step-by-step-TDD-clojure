(ns luhn-test.core)

(defn valid? [digits]
  (let [numbers (map #(Integer/parseInt (str %)) digits)]
    (if (= 1 (count numbers))
      (zero? (first numbers))
      (= 10 (+ (second numbers)
               (* 2 (first numbers)))))))
