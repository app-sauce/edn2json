(ns app.main
  (:require
    [clojure.edn :as edn]
    [cheshire.core :as json])
  (:gen-class))

(defn -main
  []
  (-> (edn/read *in*)
      json/encode
      println))
