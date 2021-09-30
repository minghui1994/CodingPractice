# Specify a base image, in this case, need a base image with node in it.
# Repository:Tag, tag is something like version 
FROM node:alpine

# any following command will be executed relative to this path in the container
# If folder does not exist, will be automatically created
WORKDIR /usr/app

# The File system snapshot of node does not contain package.json,
# even though we have it on our harddrive
# Harddrive and the file system snapshot is not connected!
COPY ./package.json ./

#Install some dependencies
RUN npm install
COPY ./ ./

# Default command
CMD ["npm", "start"]