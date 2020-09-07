# greeting-card-system
Server rest api for greeting card system. Implemented with postgres SQL database.

Deployed on: https://greeting-cards-system.herokuapp.com/swagger-ui.html

----------------
###  API provides:
* **GET(_method_: getCardTemplates) -** Provides all the templates of greeting card system.
* **PUT(_method_: addCardTemplate) -** Put command adds new card template to the catalog.
* **POST(_method_: createGreetingCard) -** Post operation on specific template according to it ID will create a greeting card.
