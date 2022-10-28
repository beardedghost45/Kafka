# Kafka
Kafka demo project
KAFKA 


Apache Kafka : Is a distributed ( component are located differently ) 
Message streaming ( flow of data ) platform that uses publish and subscribe mechanism to stream the records.
It is an open source system developed by apache.

Messaging system : transferring data from one application to another 
Point to point -> Sender to receiver . ( Maximum 1  receiver) messages are stored in a queue.No time limit 
Publish subscribe -> Service produce message and store in TOPIC. 
Multiple subscribers can consume. Time limit.

Normal scenario:



Message streaming platform : 


Kafka Ecosystem: 


Producer : Service that produce message 
Consumer : Consume message. Can read message on all level like specific partition, or topic level
Zookeeper : Service that manages the state of all the kafka brokers.
Keep metadata information related to kafka in the form of key value pairs.
Configuration 
Health status 
Broker: Kafka broker is just a server .It acts as a message broker between producer and consumer.
Brokers contain topics -> a stream of messages belonging to a particular category is called a topic.
Topic -> partitions: Each message within a partition are ordered and immutable.
 
     Topic 

	Topic 


Use round robin 
Replica and Replication can also be done .To prevent data loss
Each message inside the partition has a unique id associated with it known as Offset.


Question 1) How to send a message to a particular partition in Kafka?
Answer 1) You can specify partition number directly in the ProducerRecord, but not with kafka-console-producer.
The key is not the partition number but Kafka uses the key to specify the target partition. The default strategy is to choose a partition based on a hash of the key or use a round-robin algorithm if the key is null.
If you need a custom algorithm to map the messages to partitions, you need to implement org.apache.kafka.clients.producer.Partitioner interface. The name of you class must be set as a partitioner.class property of the producer.
https://stackoverflow.com/questions/50324249/how-to-send-message-to-a-particular-partition-in-kafka

Demo code link : 

Use this documentation for commands : https://kafka.apache.org/quickstart 
To run follow this Step and use above link for commands : 
START THE KAFKA ENVIRONMENT
CREATE A TOPIC TO STORE YOUR EVENTS
WRITE SOME EVENTS INTO THE TOPIC
READ THE EVENTS
 IMPORT/EXPORT YOUR DATA AS STREAMS OF EVENTS WITH KAFKA CONNECT

Can also use https://docs.spring.io/spring-kafka/reference/html/#introduction for Spring for Apache Kafka




