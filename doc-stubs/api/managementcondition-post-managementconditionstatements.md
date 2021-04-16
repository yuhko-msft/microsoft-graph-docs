---
title: "Add managementConditionStatement"
description: "Add managementConditionStatements by posting to the managementConditionStatements collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add managementConditionStatement
Namespace: microsoft.graph



Add managementConditionStatements by posting to the managementConditionStatements collection.

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
POST /deviceManagement/managementConditions/{managementConditionId}/managementConditionStatements/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managementConditionStatement](../resources/managementconditionstatement.md) object.

The following table shows the properties that are required when you create the [managementConditionStatement](../resources/managementconditionstatement.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|applicablePlatforms|devicePlatformType collection|The applicable platforms for this management condition statement.
This is calculated from looking the management conditions associated to the management condition statement and finding the intersection of applicable platforms. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|createdDateTime|DateTimeOffset|The time the management condition statement was created. Generated service side.|
|description|String|The admin defined description of the management condition statement.|
|displayName|String|The admin defined name of the management condition statement.|
|eTag|String|ETag of the management condition statement. Updated service side.|
|expression|[managementConditionExpression](../resources/managementconditionexpression.md)|The management condition statement expression used to evaluate if a management condition statement was activated/deactivated.|
|modifiedDateTime|DateTimeOffset|The time the management condition statement was last modified. Updated service side.|



## Response

If successful, this method returns a `204 No Content` response code and a [managementConditionStatement](../resources/managementconditionstatement.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managementconditionstatement_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/managementConditions/{managementConditionId}/managementConditionStatements/$ref
Content-Type: application/json
Content-length: 288

{
  "@odata.type": "#microsoft.graph.managementConditionStatement",
  "applicablePlatforms": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "expression": {
    "@odata.type": "microsoft.graph.managementConditionExpression"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managementConditionStatement"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managementConditionStatement",
  "id": "b7e92e17-2e17-b7e9-172e-e9b7172ee9b7",
  "applicablePlatforms": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "expression": {
    "@odata.type": "microsoft.graph.managementConditionExpression"
  },
  "modifiedDateTime": "String (timestamp)"
}
```

