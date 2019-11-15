# fpr-neural-network

Goal is : use [Sodium FRP](http://sodium.nz/) to implement and train neural networks.

Why ?

Sodium is essentially a neural network simulator algorithm - from a certain point of view,
however it is purely functional and networks can be described using very high level abstractions.

This would hopefully make it easier to implement more sophisticated neural networks and training
algorithms.

Currently neural networks are being implemented using imparative programming paradigm. The goal of
this library is to make it possible to implement neural networks and their training algorithms
using functional programming in which the network architecture and training algorithm can be described.

Execution and training of the neural network would be carried out by either [Sodium FRP](http://sodium.nz) or by [Monix](https://monix.io/docs/3x/).

Sodium makes it easier to reason about the executed algorithm because it is strictly FRP - so each learning step is a single transactional unit, however Sodium is only single threaded. 

Monix does not have the transactional guarantees but allows the training to be scaled up massively in the cloud - using event streams for distributing the calculation workload horizontally - this could be a game changer for large datasets and complex networks. 

Potentially, an event stream based, reactive, description and implementation of neural networks, might bring something new to the table that no other neural network implementation can offer yet: 
- using functional programming for describing neural networks and their training algorithms 
- massive parallelism via distributed computing in the cloud.



