---
title: "Update officeClientConfigurationAssignment"
description: "Update the properties of an officeClientConfigurationAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update officeClientConfigurationAssignment
Namespace: microsoft.graph



Update the properties of an [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) object.

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
PATCH /officeConfiguration/clientConfigurations/{officeClientConfigurationId}/assignments/{officeClientConfigurationAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) object.

The following table shows the properties that are required when you update the [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[officeConfigurationAssignmentTarget](../resources/officeconfigurationassignmenttarget.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_officeclientconfigurationassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/officeConfiguration/clientConfigurations/{officeClientConfigurationId}/assignments/{officeClientConfigurationAssignmentId}
Content-Type: application/json
Content-length: 172

{
  "@odata.type": "#microsoft.graph.officeClientConfigurationAssignment",
  "target": {
    "@odata.type": "microsoft.graph.officeConfigurationAssignmentTarget"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.officeClientConfigurationAssignment",
  "id": "b8b0681f-681f-b8b0-1f68-b0b81f68b0b8",
  "target": {
    "@odata.type": "microsoft.graph.officeConfigurationAssignmentTarget"
  }
}
```

