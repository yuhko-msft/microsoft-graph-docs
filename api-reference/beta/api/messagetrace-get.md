---
title: "Get messageTrace"
description: "Read the properties and relationships of a messageTrace object."
author: "rsuven"
ms.localizationpriority: medium
ms.prod: "security"
ms.date: "09/14/2021"
doc_type: apiPageType
---

# Get messageTrace
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Message trace in Microsoft 365 allows administrators to monitor email messages as they flow through their Exchange Online organization. It provides the administrator information to determine if a message was received, rejected, deferred, or delivered by the service. It also shows what actions were taken on the message before it reached its final status.

The information from message trace can be used to efficiently answer user questions about what happened to messages, troubleshoot mail flow issues, and validate policy changes.

Administrators can use various search criteria to search for messages in the past 10 days. The search result contains one or more [messageTrace](../resources/messagetrace.md) objects, each of which include basic information about a message such as:
- Message ID
- Sender
- Recipients
- Subject
- Message received datetime

With a message ID and a recipient, you can use the API to obtain details of all the events associated with the delivery of the message.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|MessageTrace.Read.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|MessageTrace.Read.All|

>**Note:** To access message trace information, you need to be member of one of the following role groups:
>- Global administrator
>- Security admin
>- Security reader

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /admin/exchange/messageTraces
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

| Parameter | Description |
|------------|-------------|
| $expand | Expand a navigation property. |
| $filter | Specify the query filter. |
| $top | Specify the page size. |
| $skipToken | Specify the continuation token. |

### Paging
Note that paging is consistent only when a start time and end time is specified or a specific condition is used such as query by a message ID. Without a bounded query, pages may return data that may look inconsistent since the data is changing.

Records for a page are counted by recipients, so if page size is 10 and the first message has 15 recipients, only one message is returned in the first page.

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a list of [messageTrace](../resources/messagetrace.md) objects in the response body.


## Examples

### Example 1: Get most recent message trace data

#### Request
<!-- {
  "blockType": "request",
  "name": "get_messagetrace_ex1"
}
-->
``` http
GET https://graph.microsoft.com/beta/admin/exchange/messageTraces
```

#### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "@odata.type": "microsoft.graph.messageTrace",
  "isCollection": true,
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.context": "https://graph.microsoft.com/beta/$metadata#messageTraces",
  "@odata.nextLink": "https://graph.microsoft.com/beta/admin/exchange/messageTraces?$skiptoken=8w1xSSxJDEhMT7UyAgA%253d",
  "value": [
    {
      "id": "2e3c0fac-4669-4e4a-2669-08d5dd529cbe",
      "senderEmail": "user@contoso.com",
      "receivedDateTime": "2020-06-15T23:55:22.9557353",
      "messageId": "<ea7d4b44435d4810a151eaca8d596958@CO2PR00MB0199.namprd00.prod.outlook.com>",
      "subject": "Low-severity alert",
      "size": 6677,
      "sourceIPAddress": null,
      "destinationIPAddress": null
    }
  ]
}
```

### Example 2: Get message trace data for a specific message

#### Request
<!-- {
  "blockType": "request",
  "name": "get_messagetrace_ex2"
}
-->
``` http 
GET https://graph.microsoft.com/beta/admin/exchange/messageTraces(id='2e3c0fac-4669-4e4a-2669-08d5dd529cbe')?$expand=recipients
```

#### Response
<!-- {
  "blockType": "response",
  "@odata.type": "microsoft.graph.messageTrace",
  "isCollection": false,
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-type: application/json

{
  "@odata.context": "https://graph.microsoft.com/beta/$metadata#messageTraces(recipients())",
  "id": "2e3c0fac-4669-4e4a-2669-08d5dd529cbe",
  "senderEmail": "user@contoso.com",
  "receivedDateTime": "2020-06-15T23:55:22.9557353",
  "messageId": "<ea7d4b44435d4810a151eaca8d596958@CO2PR00MB0199.namprd00.prod.outlook.com>",
  "subject": "Low-severity alert",
  "size": 6677,
  "sourceIPAddress": null,
  "destinationIPAddress": null,
  "recipients": [
    {
      "id": "06d86871-5488-45bd-ae5b-a94fae1c276f",
      "recipientEmail": "user2@contoso.com",
      "deliveryStatus": "Delivered"
    },
    {
      "id": "53ab9941-8faf-423d-bb46-666f8d7caf4f",
      "recipientEmail": "user3@contoso.com",
      "deliveryStatus": "Delivered"
    }
  ]
}
```

### Example 3: Get message trace data for a given message ID

#### Request
<!-- {
  "blockType": "request",
  "name": "get_messagetrace_ex3"
}
-->
``` http
GET https://graph.microsoft.com/beta/admin/exchange/messageTraces?$filter=messageId eq '<ea7d4b44435d4810a151eaca8d596958@CO2PR00MB0199.namprd00.prod.outlook.com>'
```

#### Response
<!-- {
  "blockType": "response",
  "@odata.type": "microsoft.graph.messageTrace",
  "isCollection": true,
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-type: application/json

{
  "@odata.context": "https://graph.microsoft.com/beta/$metadata#messageTraces",
  "value": [
    {
      "id": "2e3c0fac-4669-4e4a-2669-08d5dd529cbe",
      "senderEmail": "user@contoso.com",
      "receivedDateTime": "2020-06-15T23:55:22.9557353",
      "messageId": "<ea7d4b44435d4810a151eaca8d596958@CO2PR00MB0199.namprd00.prod.outlook.com>",
      "subject": "Low-severity alert",
      "size": 6677,
      "sourceIPAddress": null,
      "destinationIPAddress": null
    }
  ]
}
```

### Example 4: Get message trace data for a given set of recipients in a date range

#### Request
<!-- {
  "blockType": "request",
  "name": "get_messagetrace_ex4"
}
-->
``` http  
GET https://graph.microsoft.com/beta/admin/exchange/messageTraces?$filter=receivedDateTime ge 2020-06-15T00:00:00Z and receivedDateTime le 2020-06-16T23:59:59Z&$expand=recipients($filter=recipientEmail in ('user2@contoso.com', 'user3@contoso.com'))
```

#### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "@odata.type": "microsoft.graph.messageTrace",
  "isCollection": true,
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-type: application/json

{
  "@odata.context": "https://graph.microsoft.com/beta/$metadata#messageTraces(recipients())",
  "@odata.nextLink": "https://graph.microsoft.com/beta/admin/exchange/messageTraces??$filter=receivedDateTime ge 2020-06-15T00:00:00Z and receivedDateTime le 2020-06-16T23:59:59Z&$expand=recipients($filter=recipientEmail in ('user2@contoso.com', 'user3@contoso.com'))&$skiptoken=8w1xSSxJDEhMT7UyAgA%253d",
  "value": [
    {
      "id": "2e3c0fac-4669-4e4a-2669-08d5dd529cbe",
      "senderEmail": "user@contoso.com",
      "receivedDateTime": "2020-06-15T23:55:22.9557353",
      "messageId": "<ea7d4b44435d4810a151eaca8d596958@CO2PR00MB0199.namprd00.prod.outlook.com>",
      "subject": "Low-severity alert",
      "size": 6677,
      "sourceIPAddress": null,
      "destinationIPAddress": null,
      "recipients": [
        {
          "id": "015276e9-e6ea-4246-8ddb-996f805faf01",
          "recipientEmail": "user2@contoso.com",
          "deliveryStatus": "Delivered"
        },
        {
          "id": "e6b9eae8-3ab2-4a12-800b-106bc13a80b7",
          "recipientEmail": "user3@contoso.com",
          "deliveryStatus": "Delivered"
        }
      ]
    }
  ]
}
```

### Example 5: Get message trace event detail data for a given recipient

#### Request
<!-- {
  "blockType": "request",
  "name": "get_messagetrace_ex5"
}
-->
``` http 
GET https://graph.microsoft.com/beta/admin/exchange/messageTraces(id='2e3c0fac-4669-4e4a-2669-08d5dd529cbe')?$expand=recipients($filter=recipientEmail eq 'user2@contoso.com';$expand=events)
```

#### Response
<!-- {
  "blockType": "response",
  "@odata.type": "microsoft.graph.messageTrace",
  "isCollection": false,
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-type: application/json

{
  "@odata.context": "https://graph.microsoft.com/beta/$metadata#messageTraces(recipients(events()))/$entity",
  "id": "2e3c0fac-4669-4e4a-2669-08d5dd529cbe",
  "senderEmail": "user@contoso.com",
  "receivedDateTime": "2020-06-15T23:55:22.9557353",
  "messageId": "<ea7d4b44435d4810a151eaca8d596958@CO2PR00MB0199.namprd00.prod.outlook.com>",
  "subject": "Low-severity alert",
  "size": 6677,
  "sourceIPAddress": null,
  "destinationIPAddress": null,
  "recipients": [
    {
      "id": "6cb725fb-9ae0-4379-83b1-66885e5f82af",
      "recipientEmail": "user2@contoso.com",
      "deliveryStatus": "Delivered",
      "events": [
        {
          "id": "cf6d257a-e898-4ae9-ba80-9c6485a3066c",
          "dateTime": "2020-06-15T23:55:23.817",
          "eventType": "receive",
          "description": "Message received by: BL2SR01MB606"
        },
        {
          "id": "92196e47-0a5b-4121-82ad-1dc4c912700c",
          "dateTime": "2020-06-15T23:55:24.453",
          "eventType": "spam",
          "description": "Sent to Junk Folder"
        },
        {
          "id": "1de0680e-71c3-422e-86e8-4becc1867804",
          "dateTime": "2020-06-15T23:55:25.403",
          "eventType": "deliver",
          "description": "The message was successfully delivered."
        },
        {
          "id": "0c9228c2-cced-469c-95df-4d60eb38ff12",
          "dateTime": "2020-06-15T23:55:26.378",
          "eventType": "send",
          "description": "Message transferred."
        }
      ]
    }
  ] 
}
```
