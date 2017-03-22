(ns luhn-test.core)

(defn valid? [digits]
  (zero? (Integer/parseInt digits)))
