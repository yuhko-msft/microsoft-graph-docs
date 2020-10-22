---
title: "emailAppUsageUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailAppUsageUserCounts resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailAppUsageUserCounts](../api/emailappusageusercounts-list.md)|[emailAppUsageUserCounts](../resources/emailappusageusercounts.md) collection|Get a list of the [emailAppUsageUserCounts](../resources/emailappusageusercounts.md) objects and their properties.|
|[Create emailAppUsageUserCounts](../api/emailappusageusercounts-create.md)|[emailAppUsageUserCounts](../resources/emailappusageusercounts.md)|Create a new [emailAppUsageUserCounts](../resources/emailappusageusercounts.md) object.|
|[Get emailAppUsageUserCounts](../api/emailappusageusercounts-get.md)|[emailAppUsageUserCounts](../resources/emailappusageusercounts.md)|Read the properties and relationships of an [emailAppUsageUserCounts](../resources/emailappusageusercounts.md) object.|
|[Update emailAppUsageUserCounts](../api/emailappusageusercounts-update.md)|[emailAppUsageUserCounts](../resources/emailappusageusercounts.md)|Update the properties of an [emailAppUsageUserCounts](../resources/emailappusageusercounts.md) object.|
|[Delete emailAppUsageUserCounts](../api/emailappusageusercounts-delete.md)|None|Deletes an [emailAppUsageUserCounts](../resources/emailappusageusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|imap4App|Int64|**TODO: Add Description**|
|mailForMac|Int64|**TODO: Add Description**|
|otherForMobile|Int64|**TODO: Add Description**|
|outlookForMac|Int64|**TODO: Add Description**|
|outlookForMobile|Int64|**TODO: Add Description**|
|outlookForWeb|Int64|**TODO: Add Description**|
|outlookForWindows|Int64|**TODO: Add Description**|
|pop3App|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|smtpApp|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailAppUsageUserCounts",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailAppUsageUserCounts",
  "reportRefreshDate": "Date",
  "mailForMac": "Integer",
  "outlookForMac": "Integer",
  "outlookForWindows": "Integer",
  "outlookForMobile": "Integer",
  "otherForMobile": "Integer",
  "outlookForWeb": "Integer",
  "pop3App": "Integer",
  "imap4App": "Integer",
  "smtpApp": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```

