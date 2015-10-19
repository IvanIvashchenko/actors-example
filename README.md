# actors-example

move configuration.json from this folder to actors root folder
move application.json from this folder to actors/src/main/resources

outside message example:

curl -i -X POST \
  -H "Content-Type:application/json" \
  -d \
'{
 "address": {"messageMapId": {"id": "12345"}},
 "repeatAgain": true
}' \
'http://localhost:9909'


