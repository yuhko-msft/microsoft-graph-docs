---
title: "bookingAppointment resource type"
description: "Represents a booked appointment of a service by a customer in a business."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bookingAppointment resource type

Namespace: microsoft.graph



Represents a booked appointment of a service by a customer in a business.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List bookingAppointments](../api/bookingappointment-list.md)|[bookingAppointment](../resources/bookingappointment.md) collection|Get a list of the [bookingAppointment](../resources/bookingappointment.md) objects and their properties.|
|[Create bookingAppointment](../api/bookingappointment-create.md)|[bookingAppointment](../resources/bookingappointment.md)|Create a new [bookingAppointment](../resources/bookingappointment.md) object.|
|[Get bookingAppointment](../api/bookingappointment-get.md)|[bookingAppointment](../resources/bookingappointment.md)|Read the properties and relationships of a [bookingAppointment](../resources/bookingappointment.md) object.|
|[Update bookingAppointment](../api/bookingappointment-update.md)|[bookingAppointment](../resources/bookingappointment.md)|Update the properties of a [bookingAppointment](../resources/bookingappointment.md) object.|
|[Delete bookingAppointment](../api/bookingappointment-delete.md)|None|Deletes a [bookingAppointment](../resources/bookingappointment.md) object.|
|[cancel](../api/bookingappointment-cancel.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalInformation|String|**TODO: Add Description**|
|customerEmailAddress|String|**TODO: Add Description**|
|customerId|String|The id of the booking customer associated with this appointment.
If CustomerId is not specified when an appointment is created then a new customer is created based on the appointment customer information. Once set, the customerId should be considered immutable.|
|customerLocation|[location](../resources/location.md)|**TODO: Add Description**|
|customerName|String|**TODO: Add Description**|
|customerNotes|String|Notes from the customer associated with this appointment.
The value of this property is only available when reading an individual booking appointment by id. Its value can only be set when creating a new appointment with a new customer, ie, without specifying a CustomerId. After that, the property is computed from the customer represented by CustomerId.|
|customerPhone|String|**TODO: Add Description**|
|duration|Duration|**TODO: Add Description**|
|end|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|invoiceAmount|Double|**TODO: Add Description**|
|invoiceDate|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|invoiceId|String|**TODO: Add Description**|
|invoiceStatus|bookingInvoiceStatus|**TODO: Add Description**. Possible values are: `draft`, `reviewing`, `open`, `canceled`, `paid`, `corrective`.|
|invoiceUrl|String|**TODO: Add Description**|
|isLocationOnline|Boolean|**TODO: Add Description**|
|onlineMeetingUrl|String|**TODO: Add Description**|
|optOutOfCustomerEmail|Boolean|**TODO: Add Description**|
|postBuffer|Duration|**TODO: Add Description**|
|preBuffer|Duration|**TODO: Add Description**|
|price|Double|**TODO: Add Description**|
|priceType|bookingPriceType|**TODO: Add Description**. Possible values are: `undefined`, `fixedPrice`, `startingAt`, `hourly`, `free`, `priceVaries`, `callUs`, `notSet`.|
|reminders|[bookingReminder](../resources/bookingreminder.md) collection|The value of this property is only available when reading an individual booking appointment by id.|
|selfServiceAppointmentId|String|**TODO: Add Description**|
|serviceId|String|The id of the booking service associated with this appointment.|
|serviceLocation|[location](../resources/location.md)|**TODO: Add Description**|
|serviceName|String|The name of the booking service associated with this appointment.
This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the service id.|
|serviceNotes|String|The value of this property is only available when reading an individual booking appointment by id.|
|staffMemberIds|String collection|**TODO: Add Description**|
|start|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.bookingAppointment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bookingAppointment",
  "id": "String (identifier)",
  "additionalInformation": "String",
  "customerEmailAddress": "String",
  "customerId": "String",
  "customerLocation": {
    "@odata.type": "microsoft.graph.location"
  },
  "customerName": "String",
  "customerNotes": "String",
  "customerPhone": "String",
  "duration": "String (duration)",
  "end": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "invoiceAmount": "Double",
  "invoiceDate": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "invoiceId": "String",
  "invoiceStatus": "String",
  "invoiceUrl": "String",
  "isLocationOnline": "Boolean",
  "onlineMeetingUrl": "String",
  "optOutOfCustomerEmail": "Boolean",
  "postBuffer": "String (duration)",
  "preBuffer": "String (duration)",
  "price": "Double",
  "priceType": "String",
  "reminders": [
    {
      "@odata.type": "microsoft.graph.bookingReminder"
    }
  ],
  "selfServiceAppointmentId": "String",
  "serviceId": "String",
  "serviceLocation": {
    "@odata.type": "microsoft.graph.location"
  },
  "serviceName": "String",
  "serviceNotes": "String",
  "staffMemberIds": [
    "String"
  ],
  "start": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  }
}
```

