---
title: "Create application"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create application

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new application object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [application](../resources/-application.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an application object.

| Property                  | Type                                                                        | Description |
| :------------------------ | :-------------------------------------------------------------------------- | :---------- |
| api                       | [apiApplication](../resources/apiapplication.md)                            |             |
| appId                     | String                                                                      |             |
| appRoles                  | [appRole](../resources/approle.md) collection                               |             |
| createdDateTime           | DateTimeOffset                                                              |             |
| description               | String                                                                      |             |
| displayName               | String                                                                      |             |
| groupMembershipClaims     | String                                                                      |             |
| identifierUris            | String collection                                                           |             |
| info                      | [informationalUrl](../resources/informationalurl.md)                        |             |
| isDeviceOnlyAuthSupported | Boolean                                                                     |             |
| isFallbackPublicClient    | Boolean                                                                     |             |
| keyCredentials            | [keyCredential](../resources/keycredential.md) collection                   |             |
| logo                      | Stream                                                                      |             |
| notes                     | String                                                                      |             |
| optionalClaims            | [optionalClaims](../resources/optionalclaims.md)                            |             |
| parentalControlSettings   | [parentalControlSettings](../resources/parentalcontrolsettings.md)          |             |
| passwordCredentials       | [passwordCredential](../resources/passwordcredential.md) collection         |             |
| publicClient              | [publicClientApplication](../resources/publicclientapplication.md)          |             |
| publisherDomain           | String                                                                      |             |
| requiredResourceAccess    | [requiredResourceAccess](../resources/requiredresourceaccess.md) collection |             |
| signInAudience            | String                                                                      |             |
| spa                       | [spaApplication](../resources/spaapplication.md)                            |             |
| tags                      | String collection                                                           |             |
| tokenEncryptionKeyId      | Guid                                                                        |             |
| uniqueName                | String                                                                      |             |
| web                       | [webApplication](../resources/webapplication.md)                            |             |

## Response

If successful, this method returns a `201 Created` response code and an application object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_application"
}
-->

```http
POST https://graph.microsoft.com/beta/applications/{id}

Content-Type: application/json
Content-Length: 5089

{
  "@odata.type": "#microsoft.graph.application",
  "api": {
    "@odata.type": "#microsoft.graph.apiApplication",
    "acceptMappedClaims": "Boolean",
    "knownClientApplications": [
      "Guid"
    ],
    "oauth2PermissionScopes": [
      {
        "@odata.type": "#microsoft.graph.permissionScope",
        "adminConsentDescription": "String",
        "adminConsentDisplayName": "String",
        "id": "String(identifier)",
        "isEnabled": "Boolean",
        "origin": "String",
        "type": "String",
        "userConsentDescription": "String",
        "userConsentDisplayName": "String",
        "value": "String"
      }
    ],
    "preAuthorizedApplications": [
      {
        "@odata.type": "#microsoft.graph.preAuthorizedApplication",
        "appId": "String",
        "permissionIds": [
          "String"
        ]
      }
    ],
    "requestedAccessTokenVersion": "Int32",
    "resourceSpecificApplicationPermissions": [
      {
        "@odata.type": "#microsoft.graph.resourceSpecificPermission",
        "description": "String",
        "displayName": "String",
        "id": "String(identifier)",
        "isEnabled": "Boolean",
        "value": "String"
      }
    ]
  },
  "appId": "String",
  "appRoles": [
    {
      "@odata.type": "#microsoft.graph.appRole",
      "allowedMemberTypes": [
        "String"
      ],
      "description": "String",
      "displayName": "String",
      "id": "String(identifier)",
      "isEnabled": "Boolean",
      "origin": "String",
      "value": "String"
    }
  ],
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "groupMembershipClaims": "String",
  "identifierUris": [
    "String"
  ],
  "info": {
    "@odata.type": "#microsoft.graph.informationalUrl",
    "logoUrl": "String",
    "marketingUrl": "String",
    "privacyStatementUrl": "String",
    "supportUrl": "String",
    "termsOfServiceUrl": "String"
  },
  "isDeviceOnlyAuthSupported": "Boolean",
  "isFallbackPublicClient": "Boolean",
  "keyCredentials": [
    {
      "@odata.type": "#microsoft.graph.keyCredential",
      "customKeyIdentifier": "Binary",
      "displayName": "String",
      "endDateTime": "DateTimeOffset",
      "key": "Binary",
      "keyId": "Guid",
      "startDateTime": "DateTimeOffset",
      "type": "String",
      "usage": "String"
    }
  ],
  "logo": "Stream",
  "notes": "String",
  "optionalClaims": {
    "@odata.type": "#microsoft.graph.optionalClaims",
    "accessToken": [
      {
        "@odata.type": "#microsoft.graph.optionalClaim",
        "additionalProperties": [
          "String"
        ],
        "essential": "Boolean",
        "name": "String",
        "source": "String"
      }
    ],
    "idToken": [
      {
        "@odata.type": "#microsoft.graph.optionalClaim",
        "additionalProperties": [
          "String"
        ],
        "essential": "Boolean",
        "name": "String",
        "source": "String"
      }
    ],
    "saml2Token": [
      {
        "@odata.type": "#microsoft.graph.optionalClaim",
        "additionalProperties": [
          "String"
        ],
        "essential": "Boolean",
        "name": "String",
        "source": "String"
      }
    ]
  },
  "parentalControlSettings": {
    "@odata.type": "#microsoft.graph.parentalControlSettings",
    "countriesBlockedForMinors": [
      "String"
    ],
    "legalAgeGroupRule": "String"
  },
  "passwordCredentials": [
    {
      "@odata.type": "#microsoft.graph.passwordCredential",
      "customKeyIdentifier": "Binary",
      "displayName": "String",
      "endDateTime": "DateTimeOffset",
      "hint": "String",
      "keyId": "Guid",
      "secretText": "String",
      "startDateTime": "DateTimeOffset"
    }
  ],
  "publicClient": {
    "@odata.type": "#microsoft.graph.publicClientApplication",
    "redirectUris": [
      "String"
    ]
  },
  "publisherDomain": "String",
  "requiredResourceAccess": [
    {
      "@odata.type": "#microsoft.graph.requiredResourceAccess",
      "resourceAccess": [
        {
          "@odata.type": "#microsoft.graph.resourceAccess",
          "id": "String(identifier)",
          "type": "String"
        }
      ],
      "resourceAppId": "String"
    }
  ],
  "signInAudience": "String",
  "spa": {
    "@odata.type": "#microsoft.graph.spaApplication",
    "redirectUris": [
      "String"
    ]
  },
  "tags": [
    "String"
  ],
  "tokenEncryptionKeyId": "Guid",
  "uniqueName": "String",
  "web": {
    "@odata.type": "#microsoft.graph.webApplication",
    "homePageUrl": "String",
    "implicitGrantSettings": {
      "@odata.type": "#microsoft.graph.implicitGrantSettings",
      "enableAccessTokenIssuance": "Boolean",
      "enableIdTokenIssuance": "Boolean"
    },
    "logoutUrl": "String",
    "oauth2AllowImplicitFlow": "Boolean",
    "redirectUris": [
      "String"
    ]
  }
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.application"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.application",
  "api": {
    "@odata.type": "#microsoft.graph.apiApplication",
    "acceptMappedClaims": "Boolean",
    "knownClientApplications": [
      "Guid"
    ],
    "oauth2PermissionScopes": [
      {
        "@odata.type": "#microsoft.graph.permissionScope",
        "adminConsentDescription": "String",
        "adminConsentDisplayName": "String",
        "id": "String(identifier)",
        "isEnabled": "Boolean",
        "origin": "String",
        "type": "String",
        "userConsentDescription": "String",
        "userConsentDisplayName": "String",
        "value": "String"
      }
    ],
    "preAuthorizedApplications": [
      {
        "@odata.type": "#microsoft.graph.preAuthorizedApplication",
        "appId": "String",
        "permissionIds": [
          "String"
        ]
      }
    ],
    "requestedAccessTokenVersion": "Int32",
    "resourceSpecificApplicationPermissions": [
      {
        "@odata.type": "#microsoft.graph.resourceSpecificPermission",
        "description": "String",
        "displayName": "String",
        "id": "String(identifier)",
        "isEnabled": "Boolean",
        "value": "String"
      }
    ]
  },
  "appId": "String",
  "appRoles": [
    {
      "@odata.type": "#microsoft.graph.appRole",
      "allowedMemberTypes": [
        "String"
      ],
      "description": "String",
      "displayName": "String",
      "id": "String(identifier)",
      "isEnabled": "Boolean",
      "origin": "String",
      "value": "String"
    }
  ],
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "groupMembershipClaims": "String",
  "id": "String(identifier)",
  "identifierUris": [
    "String"
  ],
  "info": {
    "@odata.type": "#microsoft.graph.informationalUrl",
    "logoUrl": "String",
    "marketingUrl": "String",
    "privacyStatementUrl": "String",
    "supportUrl": "String",
    "termsOfServiceUrl": "String"
  },
  "isDeviceOnlyAuthSupported": "Boolean",
  "isFallbackPublicClient": "Boolean",
  "keyCredentials": [
    {
      "@odata.type": "#microsoft.graph.keyCredential",
      "customKeyIdentifier": "Binary",
      "displayName": "String",
      "endDateTime": "DateTimeOffset",
      "key": "Binary",
      "keyId": "Guid",
      "startDateTime": "DateTimeOffset",
      "type": "String",
      "usage": "String"
    }
  ],
  "logo": "Stream",
  "notes": "String",
  "optionalClaims": {
    "@odata.type": "#microsoft.graph.optionalClaims",
    "accessToken": [
      {
        "@odata.type": "#microsoft.graph.optionalClaim",
        "additionalProperties": [
          "String"
        ],
        "essential": "Boolean",
        "name": "String",
        "source": "String"
      }
    ],
    "idToken": [
      {
        "@odata.type": "#microsoft.graph.optionalClaim",
        "additionalProperties": [
          "String"
        ],
        "essential": "Boolean",
        "name": "String",
        "source": "String"
      }
    ],
    "saml2Token": [
      {
        "@odata.type": "#microsoft.graph.optionalClaim",
        "additionalProperties": [
          "String"
        ],
        "essential": "Boolean",
        "name": "String",
        "source": "String"
      }
    ]
  },
  "parentalControlSettings": {
    "@odata.type": "#microsoft.graph.parentalControlSettings",
    "countriesBlockedForMinors": [
      "String"
    ],
    "legalAgeGroupRule": "String"
  },
  "passwordCredentials": [
    {
      "@odata.type": "#microsoft.graph.passwordCredential",
      "customKeyIdentifier": "Binary",
      "displayName": "String",
      "endDateTime": "DateTimeOffset",
      "hint": "String",
      "keyId": "Guid",
      "secretText": "String",
      "startDateTime": "DateTimeOffset"
    }
  ],
  "publicClient": {
    "@odata.type": "#microsoft.graph.publicClientApplication",
    "redirectUris": [
      "String"
    ]
  },
  "publisherDomain": "String",
  "requiredResourceAccess": [
    {
      "@odata.type": "#microsoft.graph.requiredResourceAccess",
      "resourceAccess": [
        {
          "@odata.type": "#microsoft.graph.resourceAccess",
          "id": "String(identifier)",
          "type": "String"
        }
      ],
      "resourceAppId": "String"
    }
  ],
  "signInAudience": "String",
  "spa": {
    "@odata.type": "#microsoft.graph.spaApplication",
    "redirectUris": [
      "String"
    ]
  },
  "tags": [
    "String"
  ],
  "tokenEncryptionKeyId": "Guid",
  "uniqueName": "String",
  "web": {
    "@odata.type": "#microsoft.graph.webApplication",
    "homePageUrl": "String",
    "implicitGrantSettings": {
      "@odata.type": "#microsoft.graph.implicitGrantSettings",
      "enableAccessTokenIssuance": "Boolean",
      "enableIdTokenIssuance": "Boolean"
    },
    "logoutUrl": "String",
    "oauth2AllowImplicitFlow": "Boolean",
    "redirectUris": [
      "String"
    ]
  }
}
}

```
