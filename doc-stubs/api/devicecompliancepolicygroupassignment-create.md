---
title: "Create deviceCompliancePolicyGroupAssignment"
description: "Create a new deviceCompliancePolicyGroupAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceCompliancePolicyGroupAssignment
Namespace: microsoft.graph



Create a new [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) object.

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
POST ** Collection URI for microsoft.graph.deviceCompliancePolicyGroupAssignment not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) object.

The following table shows the properties that are required when you create the [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|excludeGroup|Boolean|Indicates if this group is should be excluded. Defaults that the group should be included|
|targetGroupId|String|The Id of the AAD group we are targeting the device compliance policy to.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicecompliancepolicygroupassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceCompliancePolicyGroupAssignment not found
Content-Type: application/json
Content-length: 139

{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyGroupAssignment",
  "excludeGroup": "Boolean",
  "targetGroupId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceCompliancePolicyGroupAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyGroupAssignment",
  "id": "2ee3a873-a873-2ee3-73a8-e32e73a8e32e",
  "excludeGroup": "Boolean",
  "targetGroupId": "String"
}
```

