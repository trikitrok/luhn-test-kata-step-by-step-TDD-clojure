(ns luhn-test.core)

(defn valid? [digits]
  (if (= 1 (count digits))
    (zero? (Integer/parseInt digits))
    (= 10 (+ (Integer/parseInt (str (second digits)))
             (* 2 (Integer/parseInt (str (first digits))))))))
