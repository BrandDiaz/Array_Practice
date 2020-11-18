(ns array.core)

(defn -main [& args]

(do
(println "Digite varios numeros: ")
(def input (read-line))
(print (str "La lista de numeros sin repetidos es: ")
(distinct (to-array input)))


)




)
