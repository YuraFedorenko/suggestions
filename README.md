#build docker image with: 
gradle build
docker build -t suggestions_backend:1.0 .

#start container with: 
docker run -dit --name suggestions --network kuber_net suggestions_backend:1.0