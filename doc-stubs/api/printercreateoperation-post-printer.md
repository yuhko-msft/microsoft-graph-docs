---
title: "Add printer"
description: "Add printer by posting to the printer collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add printer
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add printer by posting to the printer collection.

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
POST /printerCreateOperation/printer/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [printer](../resources/printer.md) object.

The following table shows the properties that are required when you create the [printer](../resources/printer.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|capabilities|[printerCapabilities](../resources/printercapabilities.md)|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|defaults|[printerDefaults](../resources/printerdefaults.md)|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|displayName|String|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|isAcceptingJobs|Boolean|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|location|[printerLocation](../resources/printerlocation.md)|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|manufacturer|String|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|model|String|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|name|String|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|status|[printerStatus](../resources/printerstatus.md)|**TODO: Add Description** Inherited from [printerBase](../resources/printerbase.md)|
|acceptingJobs|Boolean|**TODO: Add Description**|
|hasPhysicalDevice|Boolean|**TODO: Add Description**|
|isShared|Boolean|**TODO: Add Description**|
|lastSeenDateTime|DateTimeOffset|**TODO: Add Description**|
|registeredDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [printer](../resources/printer.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_printer_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/printerCreateOperation/printer/$ref
Content-Type: application/json
Content-length: 678

{
  "@odata.type": "#microsoft.graph.printer",
  "capabilities": {
    "@odata.type": "microsoft.graph.printerCapabilities"
  },
  "defaults": {
    "@odata.type": "microsoft.graph.printerDefaults"
  },
  "displayName": "String",
  "isAcceptingJobs": "Boolean",
  "location": {
    "@odata.type": "microsoft.graph.printerLocation"
  },
  "manufacturer": "String",
  "model": "String",
  "name": "String",
  "status": {
    "@odata.type": "microsoft.graph.printerStatus"
  },
  "acceptingJobs": "Boolean",
  "hasPhysicalDevice": "Boolean",
  "isShared": "Boolean",
  "lastSeenDateTime": "String (timestamp)",
  "registeredDateTime": "String (timestamp)"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.printer"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.printer",
  "id": "0c521fbf-1fbf-0c52-bf1f-520cbf1f520c",
  "capabilities": {
    "@odata.type": "microsoft.graph.printerCapabilities"
  },
  "defaults": {
    "@odata.type": "microsoft.graph.printerDefaults"
  },
  "displayName": "String",
  "isAcceptingJobs": "Boolean",
  "location": {
    "@odata.type": "microsoft.graph.printerLocation"
  },
  "manufacturer": "String",
  "model": "String",
  "name": "String",
  "status": {
    "@odata.type": "microsoft.graph.printerStatus"
  },
  "acceptingJobs": "Boolean",
  "hasPhysicalDevice": "Boolean",
  "isShared": "Boolean",
  "lastSeenDateTime": "String (timestamp)",
  "registeredDateTime": "String (timestamp)"
}
```

