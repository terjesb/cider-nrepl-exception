(ns cider-nrepl-exception.core
  (:require
   [compojure.core :as compojure :refer [defroutes GET]]
   [compojure.handler :as handler]))

(defroutes app
  (GET "/" [] {:status 200 :content-type "text/plain" :body "Hello"}))

(def my-handler
  (handler/site app))
