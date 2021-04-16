---
title: "Update targetedManagedAppConfigurationPolicySetItem"
description: "Update the properties of a targetedManagedAppConfigurationPolicySetItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update targetedManagedAppConfigurationPolicySetItem
Namespace: microsoft.graph



Update the properties of a [targetedManagedAppConfigurationPolicySetItem](../resources/targetedmanagedappconfigurationpolicysetitem.md) object.

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
PATCH /targetedManagedAppConfigurationPolicySetItem
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [targetedManagedAppConfigurationPolicySetItem](../resources/targetedmanagedappconfigurationpolicysetitem.md) object.

The following table shows the properties that are required when you update the [targetedManagedAppConfigurationPolicySetItem](../resources/targetedmanagedappconfigurationpolicysetitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Creation time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|displayName|String|DisplayName of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|errorCode|errorCode|Error code if any occured. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment Inherited from [policySetItem](../resources/policysetitem.md)|
|itemType|String|policySetType of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|payloadId|String|PayloadId of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|status|policySetStatus|Status of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [targetedManagedAppConfigurationPolicySetItem](../resources/targetedmanagedappconfigurationpolicysetitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_targetedmanagedappconfigurationpolicysetitem"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/targetedManagedAppConfigurationPolicySetItem
Content-Type: application/json
Content-length: 263

{
  "@odata.type": "#microsoft.graph.targetedManagedAppConfigurationPolicySetItem",
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "itemType": "String",
  "payloadId": "String",
  "status": "String"
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
  "@odata.type": "#microsoft.graph.targetedManagedAppConfigurationPolicySetItem",
  "id": "7c017b09-7b09-7c01-097b-017c097b017c",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "itemType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "status": "String"
}
```

