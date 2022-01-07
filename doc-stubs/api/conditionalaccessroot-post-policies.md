---
title: "Create conditionalAccessPolicy"
description: "Create a new conditionalAccessPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create conditionalAccessPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new conditionalAccessPolicy object.

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
POST /conditionalAccess/policies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object.

You can specify the following properties when creating a **conditionalAccessPolicy**.

|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Required.|
|templateId|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|state|conditionalAccessPolicyState|**TODO: Add Description**. The possible values are: `enabled`, `disabled`, `enabledForReportingButNotEnforced`. Required.|
|conditions|[Microsoft.IdentityProtectionServices.conditionalAccessConditionSet](../resources/conditionalaccessconditionset.md)|**TODO: Add Description** Required.|
|grantControls|[Microsoft.IdentityProtectionServices.conditionalAccessGrantControls](../resources/conditionalaccessgrantcontrols.md)|**TODO: Add Description** Optional.|
|sessionControls|[Microsoft.IdentityProtectionServices.conditionalAccessSessionControls](../resources/conditionalaccesssessioncontrols.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_conditionalaccesspolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/conditionalAccess/policies
Content-Type: application/json
Content-length: 482

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.conditionalAccessPolicy",
  "displayName": "String",
  "templateId": "String",
  "description": "String",
  "state": "String",
  "conditions": {
    "@odata.type": "microsoft.graph.conditionalAccessConditionSet"
  },
  "grantControls": {
    "@odata.type": "microsoft.graph.conditionalAccessGrantControls"
  },
  "sessionControls": {
    "@odata.type": "microsoft.graph.conditionalAccessSessionControls"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.IdentityProtectionServices.conditionalAccessPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.conditionalAccessPolicy",
  "id": "aa86e4ea-e4ea-aa86-eae4-86aaeae486aa",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "templateId": "String",
  "description": "String",
  "state": "String",
  "conditions": {
    "@odata.type": "microsoft.graph.conditionalAccessConditionSet"
  },
  "grantControls": {
    "@odata.type": "microsoft.graph.conditionalAccessGrantControls"
  },
  "sessionControls": {
    "@odata.type": "microsoft.graph.conditionalAccessSessionControls"
  }
}
```

