---
title: "Create deviceConfigurationUserStateSummary"
description: "Create a new deviceConfigurationUserStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceConfigurationUserStateSummary
Namespace: microsoft.graph



Create a new deviceConfigurationUserStateSummary object.

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
POST /deviceManagement/deviceConfigurationUserStateSummaries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) object.

The following table shows the properties that are required when you create the [deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|compliantUserCount|Int32|Number of compliant users|
|conflictUserCount|Int32|Number of conflict users|
|errorUserCount|Int32|Number of error users|
|nonCompliantUserCount|Int32|Number of NonCompliant users|
|notApplicableUserCount|Int32|Number of not applicable users|
|remediatedUserCount|Int32|Number of remediated users|
|unknownUserCount|Int32|Number of unknown users|



## Response

If successful, this method returns a `201 Created` response code and a [deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceconfigurationuserstatesummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurationUserStateSummaries
Content-Type: application/json
Content-length: 330

{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserStateSummary",
  "compliantUserCount": "Integer",
  "conflictUserCount": "Integer",
  "errorUserCount": "Integer",
  "nonCompliantUserCount": "Integer",
  "notApplicableUserCount": "Integer",
  "remediatedUserCount": "Integer",
  "unknownUserCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceConfigurationUserStateSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserStateSummary",
  "id": "3697884f-884f-3697-4f88-97364f889736",
  "compliantUserCount": "Integer",
  "conflictUserCount": "Integer",
  "errorUserCount": "Integer",
  "nonCompliantUserCount": "Integer",
  "notApplicableUserCount": "Integer",
  "remediatedUserCount": "Integer",
  "unknownUserCount": "Integer"
}
```

