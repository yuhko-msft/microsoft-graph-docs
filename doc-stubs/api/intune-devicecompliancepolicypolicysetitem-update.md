---
title: "Update deviceCompliancePolicyPolicySetItem"
description: "Update the properties of a deviceCompliancePolicyPolicySetItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceCompliancePolicyPolicySetItem
Namespace: microsoft.graph

Update the properties of a [deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /deviceCompliancePolicyPolicySetItem
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md) object.

The following table shows the properties that are required when you create the [deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|payloadId|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|itemType|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|displayName|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|status|policySetStatus|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|
|errorCode|errorCode|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceCompliancePolicyPolicySetItem](../resources/intune-devicecompliancepolicypolicysetitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicecompliancepolicypolicysetitem"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceCompliancePolicyPolicySetItem
Content-Type: application/json
Content-length: 254

{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyPolicySetItem",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ]
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
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyPolicySetItem",
  "id": "0ba5ac9c-ac9c-0ba5-9cac-a50b9caca50b",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ]
}
```

