(ns stock.core
  (:gen-class))

(defn -main
  [& args]
  (discounted-price (args 0)))
