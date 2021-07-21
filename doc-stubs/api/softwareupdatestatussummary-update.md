---
title: "Update softwareUpdateStatusSummary"
description: "Update the properties of a softwareUpdateStatusSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update softwareUpdateStatusSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object.

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
PATCH /deviceManagement/softwareUpdateStatusSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object.

The following table shows the properties that are required when you update the [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|compliantDeviceCount|Int32|Number of compliant devices.|
|compliantUserCount|Int32|Number of compliant users.|
|conflictDeviceCount|Int32|Number of conflict devices.|
|conflictUserCount|Int32|Number of conflict users.|
|displayName|String|The name of the policy.|
|errorDeviceCount|Int32|Number of devices had error.|
|errorUserCount|Int32|Number of users had error.|
|nonCompliantDeviceCount|Int32|Number of non compliant devices.|
|nonCompliantUserCount|Int32|Number of non compliant users.|
|notApplicableDeviceCount|Int32|Number of not applicable devices.|
|notApplicableUserCount|Int32|Number of not applicable users.|
|remediatedDeviceCount|Int32|Number of remediated devices.|
|remediatedUserCount|Int32|Number of remediated users.|
|unknownDeviceCount|Int32|Number of unknown devices.|
|unknownUserCount|Int32|Number of unknown users.|



## Response

If successful, this method returns a `200 OK` response code and an updated [softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_softwareupdatestatussummary"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/softwareUpdateStatusSummary
Content-Type: application/json
Content-length: 617

{
  "@odata.type": "#microsoft.graph.softwareUpdateStatusSummary",
  "compliantDeviceCount": "Integer",
  "compliantUserCount": "Integer",
  "conflictDeviceCount": "Integer",
  "conflictUserCount": "Integer",
  "displayName": "String",
  "errorDeviceCount": "Integer",
  "errorUserCount": "Integer",
  "nonCompliantDeviceCount": "Integer",
  "nonCompliantUserCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "notApplicableUserCount": "Integer",
  "remediatedDeviceCount": "Integer",
  "remediatedUserCount": "Integer",
  "unknownDeviceCount": "Integer",
  "unknownUserCount": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.softwareUpdateStatusSummary",
  "id": "be0f584b-584b-be0f-4b58-0fbe4b580fbe",
  "compliantDeviceCount": "Integer",
  "compliantUserCount": "Integer",
  "conflictDeviceCount": "Integer",
  "conflictUserCount": "Integer",
  "displayName": "String",
  "errorDeviceCount": "Integer",
  "errorUserCount": "Integer",
  "nonCompliantDeviceCount": "Integer",
  "nonCompliantUserCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "notApplicableUserCount": "Integer",
  "remediatedDeviceCount": "Integer",
  "remediatedUserCount": "Integer",
  "unknownDeviceCount": "Integer",
  "unknownUserCount": "Integer"
}
```

