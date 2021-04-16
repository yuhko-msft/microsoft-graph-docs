---
title: "Create bookingAppointment"
description: "Create a new bookingAppointment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create bookingAppointment
Namespace: microsoft.graph



Create a new bookingAppointment object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /bookingBusinesses/{bookingBusinessesId}/appointments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [bookingAppointment](../resources/bookingappointment.md) object.

The following table shows the properties that are required when you create the [bookingAppointment](../resources/bookingappointment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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



## Response

If successful, this method returns a `201 Created` response code and a [bookingAppointment](../resources/bookingappointment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_bookingappointment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/bookingBusinesses/{bookingBusinessesId}/appointments
Content-Type: application/json
Content-length: 1274

{
  "@odata.type": "#microsoft.graph.bookingAppointment",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.bookingAppointment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.bookingAppointment",
  "id": "591f7e2f-7e2f-591f-2f7e-1f592f7e1f59",
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

