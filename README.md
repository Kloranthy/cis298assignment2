# Assignment 2 - Temperature Converter
## Due 10-10-2016
## Author: Josh Weigel

## Description

A temperature converter application
similar in appearance to the provided screen shots

converts a temperature provided by the user from a selected source format to a selected target format
performs the calculation using a static method in a separate class



The application should look like the screen shots I have provided.
The application should do the calculation and display the formula that was used to do the calculation.
The calculation of the conversion should take place in a separate class
The application should handle errors gracefully.
The application should have a different layout for landscape form that looks like the one pictured here.
The application must retain it's information on the screen when rotated to landscape.

Solution Requirements:

* Separate class for calculation
* Handle errors gracefully
* Display Formula and Answer
* Separate Layout for landscape
* Retain information across rotation

### Notes
0 is used as a default value for the user provided temperature

when user provides invalid input for temperature,
	the last valid value is used
	no notification is given

celsius is used as default format for both source and target when no radio buttons have been selected

## Grading
| Feature                  | Points |
| ------------------------ | ------ |
| Radio Buttons Work       | 10     |
| Displays Formula         | 10     |
| Displays Answer          | 15     |
| Separate Class For Calcs | 10     |
| Handle Errors            | 10     |
| Portrait Layout          | 10     |
| Landscape Layout         | 10     |
| Retain On Rotation       | 15     |
| Documentation            | 5      |
| README                   | 5      |
| Total                    | 100    |

## Outside Resources Used
textbook and in class examples?

## Known Problems, Issues, And/Or Errors in the Program
formula textview not completed yet

application does not retrieve savedInstantState yet

no radio buttons are selected until the user selects them

