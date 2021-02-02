---
title: "Create partnerDeviceCompliancePolicy"
description: "Create a new partnerDeviceCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create partnerDeviceCompliancePolicy
Namespace: microsoft.graph

Create a new [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) object.

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
POST ** Collection URI for microsoft.graph.partnerDeviceCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) object.

The following table shows the properties that are required when you create the [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|partnerAppId|String|**TODO: Add Description**|
|partnerPolicyId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_partnerdevicecompliancepolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.partnerDeviceCompliancePolicy not found
Content-Type: application/json
Content-length: 257

{
  "@odata.type": "#microsoft.graph.partnerDeviceCompliancePolicy",
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "partnerAppId": "String",
  "partnerPolicyId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.partnerDeviceCompliancePolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.partnerDeviceCompliancePolicy",
  "id": "6284093f-093f-6284-3f09-84623f098462",
  "roleScopeTagIds": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer",
  "partnerAppId": "String",
  "partnerPolicyId": "String"
}
```

