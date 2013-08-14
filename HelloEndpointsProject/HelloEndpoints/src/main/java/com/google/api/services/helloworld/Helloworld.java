/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-08-07 19:00:49 UTC)
 * on 2013-08-09 at 20:55:31 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.helloworld;

/**
 * Service definition for Helloworld (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link HelloworldRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Helloworld extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the  library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://dwh-test.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "helloworld/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Helloworld(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Helloworld(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Greetings collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Helloworld helloworld = new Helloworld(...);}
   *   {@code Helloworld.Greetings.List request = helloworld.greetings().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Greetings greetings() {
    return new Greetings();
  }

  /**
   * The "greetings" collection of methods.
   */
  public class Greetings {

    /**
     * Create a request for the method "greetings.authed".
     *
     * This request holds the parameters needed by the the helloworld server.  After setting any
     * optional parameters, call the {@link Authed#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public Authed authed() throws java.io.IOException {
      Authed result = new Authed();
      initialize(result);
      return result;
    }

    public class Authed extends HelloworldRequest<com.google.api.services.helloworld.model.Greeting> {

      private static final String REST_PATH = "greeting/authed";

      /**
       * Create a request for the method "greetings.authed".
       *
       * This request holds the parameters needed by the the helloworld server.  After setting any
       * optional parameters, call the {@link Authed#execute()} method to invoke the remote operation.
       * <p> {@link
       * Authed#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected Authed() {
        super(Helloworld.this, "POST", REST_PATH, null, com.google.api.services.helloworld.model.Greeting.class);
      }

      @Override
      public Authed setAlt(java.lang.String alt) {
        return (Authed) super.setAlt(alt);
      }

      @Override
      public Authed setFields(java.lang.String fields) {
        return (Authed) super.setFields(fields);
      }

      @Override
      public Authed setKey(java.lang.String key) {
        return (Authed) super.setKey(key);
      }

      @Override
      public Authed setOauthToken(java.lang.String oauthToken) {
        return (Authed) super.setOauthToken(oauthToken);
      }

      @Override
      public Authed setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Authed) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Authed setQuotaUser(java.lang.String quotaUser) {
        return (Authed) super.setQuotaUser(quotaUser);
      }

      @Override
      public Authed setUserIp(java.lang.String userIp) {
        return (Authed) super.setUserIp(userIp);
      }

      @Override
      public Authed set(String parameterName, Object value) {
        return (Authed) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "greetings.getGreeting".
     *
     * This request holds the parameters needed by the the helloworld server.  After setting any
     * optional parameters, call the {@link GetGreeting#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public GetGreeting getGreeting(java.lang.Integer id) throws java.io.IOException {
      GetGreeting result = new GetGreeting(id);
      initialize(result);
      return result;
    }

    public class GetGreeting extends HelloworldRequest<com.google.api.services.helloworld.model.Greeting> {

      private static final String REST_PATH = "greeting/{id}";

      /**
       * Create a request for the method "greetings.getGreeting".
       *
       * This request holds the parameters needed by the the helloworld server.  After setting any
       * optional parameters, call the {@link GetGreeting#execute()} method to invoke the remote
       * operation. <p> {@link
       * GetGreeting#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected GetGreeting(java.lang.Integer id) {
        super(Helloworld.this, "GET", REST_PATH, null, com.google.api.services.helloworld.model.Greeting.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetGreeting setAlt(java.lang.String alt) {
        return (GetGreeting) super.setAlt(alt);
      }

      @Override
      public GetGreeting setFields(java.lang.String fields) {
        return (GetGreeting) super.setFields(fields);
      }

      @Override
      public GetGreeting setKey(java.lang.String key) {
        return (GetGreeting) super.setKey(key);
      }

      @Override
      public GetGreeting setOauthToken(java.lang.String oauthToken) {
        return (GetGreeting) super.setOauthToken(oauthToken);
      }

      @Override
      public GetGreeting setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetGreeting) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetGreeting setQuotaUser(java.lang.String quotaUser) {
        return (GetGreeting) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetGreeting setUserIp(java.lang.String userIp) {
        return (GetGreeting) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Integer id;

      /**

       */
      public java.lang.Integer getId() {
        return id;
      }

      public GetGreeting setId(java.lang.Integer id) {
        this.id = id;
        return this;
      }

      @Override
      public GetGreeting set(String parameterName, Object value) {
        return (GetGreeting) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "greetings.listGreeting".
     *
     * This request holds the parameters needed by the the helloworld server.  After setting any
     * optional parameters, call the {@link ListGreeting#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListGreeting listGreeting() throws java.io.IOException {
      ListGreeting result = new ListGreeting();
      initialize(result);
      return result;
    }

    public class ListGreeting extends HelloworldRequest<com.google.api.services.helloworld.model.GreetingCollection> {

      private static final String REST_PATH = "greeting";

      /**
       * Create a request for the method "greetings.listGreeting".
       *
       * This request holds the parameters needed by the the helloworld server.  After setting any
       * optional parameters, call the {@link ListGreeting#execute()} method to invoke the remote
       * operation. <p> {@link
       * ListGreeting#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListGreeting() {
        super(Helloworld.this, "GET", REST_PATH, null, com.google.api.services.helloworld.model.GreetingCollection.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListGreeting setAlt(java.lang.String alt) {
        return (ListGreeting) super.setAlt(alt);
      }

      @Override
      public ListGreeting setFields(java.lang.String fields) {
        return (ListGreeting) super.setFields(fields);
      }

      @Override
      public ListGreeting setKey(java.lang.String key) {
        return (ListGreeting) super.setKey(key);
      }

      @Override
      public ListGreeting setOauthToken(java.lang.String oauthToken) {
        return (ListGreeting) super.setOauthToken(oauthToken);
      }

      @Override
      public ListGreeting setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (ListGreeting) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListGreeting setQuotaUser(java.lang.String quotaUser) {
        return (ListGreeting) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListGreeting setUserIp(java.lang.String userIp) {
        return (ListGreeting) super.setUserIp(userIp);
      }

      @Override
      public ListGreeting set(String parameterName, Object value) {
        return (ListGreeting) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "greetings.multiply".
     *
     * This request holds the parameters needed by the the helloworld server.  After setting any
     * optional parameters, call the {@link Multiply#execute()} method to invoke the remote operation.
     *
     * @param times
     * @param content the {@link com.google.api.services.helloworld.model.Greeting}
     * @return the request
     */
    public Multiply multiply(java.lang.Integer times, com.google.api.services.helloworld.model.Greeting content) throws java.io.IOException {
      Multiply result = new Multiply(times, content);
      initialize(result);
      return result;
    }

    public class Multiply extends HelloworldRequest<com.google.api.services.helloworld.model.Greeting> {

      private static final String REST_PATH = "greeting/{times}";

      /**
       * Create a request for the method "greetings.multiply".
       *
       * This request holds the parameters needed by the the helloworld server.  After setting any
       * optional parameters, call the {@link Multiply#execute()} method to invoke the remote operation.
       * <p> {@link
       * Multiply#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param times
       * @param content the {@link com.google.api.services.helloworld.model.Greeting}
       * @since 1.13
       */
      protected Multiply(java.lang.Integer times, com.google.api.services.helloworld.model.Greeting content) {
        super(Helloworld.this, "POST", REST_PATH, content, com.google.api.services.helloworld.model.Greeting.class);
        this.times = com.google.api.client.util.Preconditions.checkNotNull(times, "Required parameter times must be specified.");
      }

      @Override
      public Multiply setAlt(java.lang.String alt) {
        return (Multiply) super.setAlt(alt);
      }

      @Override
      public Multiply setFields(java.lang.String fields) {
        return (Multiply) super.setFields(fields);
      }

      @Override
      public Multiply setKey(java.lang.String key) {
        return (Multiply) super.setKey(key);
      }

      @Override
      public Multiply setOauthToken(java.lang.String oauthToken) {
        return (Multiply) super.setOauthToken(oauthToken);
      }

      @Override
      public Multiply setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Multiply) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Multiply setQuotaUser(java.lang.String quotaUser) {
        return (Multiply) super.setQuotaUser(quotaUser);
      }

      @Override
      public Multiply setUserIp(java.lang.String userIp) {
        return (Multiply) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Integer times;

      /**

       */
      public java.lang.Integer getTimes() {
        return times;
      }

      public Multiply setTimes(java.lang.Integer times) {
        this.times = times;
        return this;
      }

      @Override
      public Multiply set(String parameterName, Object value) {
        return (Multiply) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Helloworld}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Helloworld}. */
    @Override
    public Helloworld build() {
      return new Helloworld(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link HelloworldRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setHelloworldRequestInitializer(
        HelloworldRequestInitializer helloworldRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(helloworldRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
