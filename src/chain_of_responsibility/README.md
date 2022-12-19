#Chain of Responsibility Pattern

Category: Behavioral Pattern

Pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

**When?**

`When a program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand`

`When it’s essential to execute several handlers in a particular order`

`When the set of handlers and their order are supposed to change at runtime.`

`Multiple objects, determined at runtime, are candidates to handle a request`


**Pros**
1) You can control the order of request handling.
2) Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations.
3) Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code.


**Example explanation -**

One of the most popular examples of this design pattern is - The ATM machine

Suppose, you need 1000 Taka to be dispensed from the atm. And only available note denominations are 100, 200, and 500.

The system is designed to start with the highest available denomination. So it will first check if any 500 taka notes are to be dispensed, followed by 200 and then 100.

(Just to keep things simple, assume that the notes for each denomination are available in more than enough quantities 😁 )

Here if you need 1000 taka - You would get two 500 taka notes and that's it, processing is done.
If you need 1300 taka - You would get of 500, 200 and 100 note to make it 1300.
If you put any denomination less than 100 - You can handle it to give an error message before actually processing anything.
