---
title: "Create deviceCompliancePolicy"
description: "Create a new deviceCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceCompliancePolicy
Namespace: microsoft.graph



Create a new [deviceCompliancePolicy](../resources/devicecompliancepolicy.md) object.

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
POST /deviceManagement/deviceCompliancePolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceCompliancePolicy](../resources/devicecompliancepolicy.md) object.

The following table shows the properties that are required when you create the [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Admin provided description of the Device Configuration.|
|displayName|String|Admin provided name of the device configuration.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|version|Int32|Version of the device configuration.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceCompliancePolicy](../resources/devicecompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicecompliancepolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceCompliancePolicies
Content-Type: application/json
Content-length: 189

{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicy",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceCompliancePolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicy",
  "id": "84988751-8751-8498-5187-988451879884",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```

