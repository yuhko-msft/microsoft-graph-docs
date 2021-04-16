---
title: "emailAppUsageAppsUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailAppUsageAppsUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailAppUsageAppsUserCounts](../api/emailappusageappsusercounts-list.md)|[emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) collection|Get a list of the [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) objects and their properties.|
|[Create emailAppUsageAppsUserCounts](../api/emailappusageappsusercounts-create.md)|[emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md)|Create a new [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object.|
|[Get emailAppUsageAppsUserCounts](../api/emailappusageappsusercounts-get.md)|[emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md)|Read the properties and relationships of an [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object.|
|[Update emailAppUsageAppsUserCounts](../api/emailappusageappsusercounts-update.md)|[emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md)|Update the properties of an [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object.|
|[Delete emailAppUsageAppsUserCounts](../api/emailappusageappsusercounts-delete.md)|None|Deletes an [emailAppUsageAppsUserCounts](../resources/emailappusageappsusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|imap4App|Int64|**TODO: Add Description**|
|mailForMac|Int64|**TODO: Add Description**|
|otherForMobile|Int64|**TODO: Add Description**|
|outlookForMac|Int64|**TODO: Add Description**|
|outlookForMobile|Int64|**TODO: Add Description**|
|outlookForWeb|Int64|**TODO: Add Description**|
|outlookForWindows|Int64|**TODO: Add Description**|
|pop3App|Int64|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.emailAppUsageAppsUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailAppUsageAppsUserCounts",
  "id": "String (identifier)",
  "imap4App": "Integer",
  "mailForMac": "Integer",
  "otherForMobile": "Integer",
  "outlookForMac": "Integer",
  "outlookForMobile": "Integer",
  "outlookForWeb": "Integer",
  "outlookForWindows": "Integer",
  "pop3App": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "smtpApp": "Integer"
}
```

