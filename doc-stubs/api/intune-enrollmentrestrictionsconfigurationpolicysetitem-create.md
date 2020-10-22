---
title: "Create enrollmentRestrictionsConfigurationPolicySetItem"
description: "Create a new enrollmentRestrictionsConfigurationPolicySetItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create enrollmentRestrictionsConfigurationPolicySetItem
Namespace: microsoft.graph

Create a new [enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md) object.

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
POST ** Collection URI for microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md) object.

The following table shows the properties that are required when you create the [enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md).

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
|priority|Int32|**TODO: Add Description**|
|limit|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_enrollmentrestrictionsconfigurationpolicysetitem_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem not found
Content-Type: application/json
Content-length: 316

{
  "@odata.type": "#microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "priority": "Integer",
  "limit": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem",
  "id": "06d7a972-a972-06d7-72a9-d70672a9d706",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "priority": "Integer",
  "limit": "Integer"
}
```

